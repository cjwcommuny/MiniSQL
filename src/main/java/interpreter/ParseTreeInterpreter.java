package interpreter;

import common.datastructure.Column;
import common.datastructure.Condition;
import common.datastructure.implementation.DefaultColumn;
import common.info.FileNotFoundError;
import common.info.Info;
import common.info.NameDuplicationInfo;
import common.type.Type;
import common.type.implementation.DefaultCondition;
import common.type.implementation.TypeFactory;
import interpreter.antlrparser.MiniSqlBaseVisitor;
import interpreter.antlrparser.MiniSqlParser;
import interpreter.api.DatabaseFacade;
import interpreter.error.NameDuplicationException;
import interpreter.error.ParseException;
import interpreter.error.QuitException;
import interpreter.visittree.*;
import manager.TableManager;
import middlelayer.IndexManager;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class ParseTreeInterpreter extends MiniSqlBaseVisitor<ParseTreeVisitResult> {
    private DefaultInterpreter interpreter;
    private DatabaseFacade database;
    private PrintStream printStream;

    ParseTreeInterpreter(DefaultInterpreter interpreter, DatabaseFacade database, PrintStream printStream) {
        this.interpreter = interpreter;
        this.database = database;
        this.printStream = printStream;
    }

    @Override
    public ParseTreeVisitResult visitInstructionWrap(MiniSqlParser.InstructionWrapContext ctx) {
        return visit(ctx.instruction());
    }

    @Override
    public InstructionVisitResult visitInstruction(MiniSqlParser.InstructionContext ctx) {
        if (ctx.getChildCount() == 0) {
            return new InstructionVisitResult(new LinkedList<>());
        }
        ParseTreeVisitResult visitResult = visit(ctx.getChild(0));
        if (visitResult instanceof EofVisitResult) {
            return new InstructionVisitResult(new LinkedList<>());
        }
        return (InstructionVisitResult) visitResult;
    }

    @Override
    public InstructionVisitResult visitCreateTable(MiniSqlParser.CreateTableContext ctx) {
        String tableName = ctx.NAME_IDENTIFIER().getText();

        var primaryKeyVisitResult = (PrimaryKeyVisitResult) visit(ctx.primaryKeyDefinition());
        String primaryKeyName = primaryKeyVisitResult.getPrimaryKeyName();

        List<Column> columns = new ArrayList<>();//TODO: linkedlist
        Column primaryColumn = null;
        Set<String> columnNames = new HashSet<>();
        for (var columnDefinition: ctx.columnDefinition()) {
            var columnVisitResult = (ColumnDefinitionVisitResult) visit(columnDefinition);
            Column column = columnVisitResult.getColumn();
            String columnName = column.getColumnName();
            if (columnNames.contains(columnName)) {
                //name duplicate error
                var nameDuplicationException = new NameDuplicationException();
                nameDuplicationException.addInfo(new NameDuplicationInfo("column name", columnName));
                throw nameDuplicationException;
            }
            columnNames.add(columnName);
            if (primaryColumn == null && columnName.equals(primaryKeyName)) {
                primaryColumn = column;
            }
            columns.add(column);
        }
        List<Info> infos = database.createTable(tableName, columns, primaryColumn);
        return new InstructionVisitResult(infos);
    }

    @Override
    public PrimaryKeyVisitResult visitPrimaryKeyDefinition(MiniSqlParser.PrimaryKeyDefinitionContext ctx) {
        return new PrimaryKeyVisitResult(ctx.NAME_IDENTIFIER().getText());
    }

    @Override
    public ColumnDefinitionVisitResult visitColumnDefinition(MiniSqlParser.ColumnDefinitionContext ctx) {
        String columnName = ctx.NAME_IDENTIFIER().getText();
        Type type = ((TypeVisitResult) visit(ctx.type_identifier())).getType();
        boolean isUnique = ctx.UNIQUE() != null;
        Column column = new DefaultColumn(isUnique, columnName, type);
        return new ColumnDefinitionVisitResult(column);
    }

    @Override
    public TypeVisitResult visitIntType(MiniSqlParser.IntTypeContext ctx) {
        return new TypeVisitResult(TypeFactory.generateIntType());
    }

    @Override
    public TypeVisitResult visitFloatType(MiniSqlParser.FloatTypeContext ctx) {
        return new TypeVisitResult(TypeFactory.generateFloatType());
    }

    @Override
    public TypeVisitResult visitCharNType(MiniSqlParser.CharNTypeContext ctx) {
        int length = ((IntLiteralVisitResult) visit(ctx.INT_LITERAL())).getValue();
        return new TypeVisitResult(TypeFactory.generateCharNType(length));
    }

    @Override
    public ParseTreeVisitResult visitTerminal(TerminalNode node) {
        String symbol = node.getSymbol().getText();
        switch (node.getSymbol().getType()) {
            case MiniSqlParser.INT_LITERAL:
                return new IntLiteralVisitResult(Integer.valueOf(symbol));
            case MiniSqlParser.STRING_LITERAL:
                return new StringLiteralVisitResult(symbol.substring(1, symbol.length() - 1));
            case MiniSqlParser.EOF:
                return new EofVisitResult();
            default:
                //error
                System.err.println("visit terminal error");
                return null;
        }
    }

    @Override
    public InstructionVisitResult visitDropTable(MiniSqlParser.DropTableContext ctx) {
        String tableName = ctx.NAME_IDENTIFIER().getText();
        List<Info> infos = database.deleteTable(tableName);
        return new InstructionVisitResult(infos);
    }

    @Override
    public InstructionVisitResult visitCreateIndex(MiniSqlParser.CreateIndexContext ctx) {
        String indexName = ctx.NAME_IDENTIFIER(0).getText();
        String tableName = ctx.NAME_IDENTIFIER(1).getText();
        String columnName = ctx.NAME_IDENTIFIER(2).getText();
        List<Info> infos = database.createIndex(indexName, tableName, columnName);
        return new InstructionVisitResult(infos);
    }

    @Override
    public InstructionVisitResult visitDropIndex(MiniSqlParser.DropIndexContext ctx) {
        String indexName = ctx.NAME_IDENTIFIER().getText();
        List<Info> infos = database.deleteIndex(indexName);
        return new InstructionVisitResult(infos);
    }

    @Override
    public InstructionVisitResult visitSelectInstruction(MiniSqlParser.SelectInstructionContext ctx) {
        String tableName = ctx.NAME_IDENTIFIER().getText();
        List<Condition> conditions;
        if (ctx.WHERE() == null) {
            //where clause not exists
            conditions = new LinkedList<>();
        } else {
            var conditionsVisitResult = (ConditionsVisitResult) visit(ctx.conditions());
            conditions = conditionsVisitResult.getConditions();
        }
        List<Info> infos = database.select(tableName, conditions);
        return new InstructionVisitResult(infos);
    }

    @Override
    public ConditionsVisitResult visitConditions(MiniSqlParser.ConditionsContext ctx) {
        List<Condition> conditions = new LinkedList<>();
        for (var conditionContext: ctx.condition()) {
            var conditionVisitResult = (ConditionVisitResult) visit(conditionContext);
            conditions.add(conditionVisitResult.getCondition());
        }
        return new ConditionsVisitResult(conditions);
    }

    @Override
    public ConditionVisitResult visitCondition(MiniSqlParser.ConditionContext ctx) {
        String columnName = ctx.NAME_IDENTIFIER().getText();
        String op = ctx.OP().getText();
        var literalVisitResult = (LiteralVisitResult) visit(ctx.literal());
        Object value = literalVisitResult.getValue();
        Condition condition = new DefaultCondition(Condition.ConditionType.construct(op), columnName, value);
        return new ConditionVisitResult(condition);
    }

    @Override
    public InstructionVisitResult visitInsertTuple(MiniSqlParser.InsertTupleContext ctx) {
        String tableName = ctx.NAME_IDENTIFIER().getText();
        List<Object> values = new LinkedList<>();
        for (var literalContext: ctx.literal()) {
            values.add(((LiteralVisitResult) visit(literalContext)).getValue());
        }
        List<Info> infos = database.insertTuple(tableName, values);
        return new InstructionVisitResult(infos);
    }

    @Override
    public InstructionVisitResult visitDeleteTuple(MiniSqlParser.DeleteTupleContext ctx) {
        String tableName = ctx.NAME_IDENTIFIER().getText();
        List<Condition> conditions;
        if (ctx.WHERE() == null) {
            conditions = new LinkedList<>();
        } else {
            conditions = ((ConditionsVisitResult) visit(ctx.conditions())).getConditions();
        }
        List<Info> infos = database.deleteTuple(tableName, conditions);
        return new InstructionVisitResult(infos);
    }

    @Override
    public ParseTreeVisitResult visitQuit(MiniSqlParser.QuitContext ctx) {
        database.quit();
        throw new QuitException();
    }

    @Override
    public ParseTreeVisitResult visitExecuteFile(MiniSqlParser.ExecuteFileContext ctx) {
        long startTime = System.nanoTime(); //TODO: for test

        String fileName = ((StringLiteralVisitResult) visit(ctx.STRING_LITERAL())).getValue();
        try {
            var fileInputStream = new FileInputStream(fileName);
            interpreter.handleInstructions(fileInputStream, printStream, false);
            return new InstructionVisitResult(new LinkedList<>());
        } catch (FileNotFoundException e) {
            var exception = new ParseException();
            exception.addInfo(new FileNotFoundError(fileName));
            throw exception;
        } finally {
            //TODO: for test
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            double seconds = (double)totalTime / 1_000_000_000.0;
            System.out.println("exec file time: " + seconds + "s");
//            TableManager.getInstance().getTable("student").getIndex("sno").print();
        }
    }

    @Override
    public LiteralVisitResult visitLiteral(MiniSqlParser.LiteralContext ctx) {
        return (LiteralVisitResult) visit(ctx.getChild(0));
    }
}
