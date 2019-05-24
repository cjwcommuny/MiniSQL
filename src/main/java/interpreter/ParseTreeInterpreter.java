package interpreter;

import common.Column;
import common.implementation.DefaultColumn;
import common.info.Info;
import common.info.NameDuplicationInfo;
import common.type.Type;
import common.type.implementation.TypeFactory;
import interpreter.antlrparser.MiniSqlBaseVisitor;
import interpreter.antlrparser.MiniSqlParser;
import interpreter.api.DatabaseFacade;
import interpreter.error.NameDuplicationException;
import interpreter.visittree.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ParseTreeInterpreter extends MiniSqlBaseVisitor<ParseTreeVisitResult> {
    private DefaultInterpreter interpreter;
    private DatabaseFacade database;

    public ParseTreeInterpreter(DefaultInterpreter interpreter, DatabaseFacade database) {
        this.interpreter = interpreter;
        this.database = database;
    }

    @Override
    public ParseTreeVisitResult visitInstruction(MiniSqlParser.InstructionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public ParseTreeVisitResult visitCreateTable(MiniSqlParser.CreateTableContext ctx) {
        String tableName = ctx.NAME_IDENTIFIER().getText();

        var primaryKeyVisitResult = (PrimaryKeyVisitResult) visit(ctx.primaryKeyDefinition());
        String primaryKeyName = primaryKeyVisitResult.getPrimaryKeyName();

        List<Column> columns = new LinkedList<>();
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
    public ParseTreeVisitResult visitPrimaryKeyDefinition(MiniSqlParser.PrimaryKeyDefinitionContext ctx) {
        return new PrimaryKeyVisitResult(ctx.NAME_IDENTIFIER().getText());
    }

    @Override
    public ParseTreeVisitResult visitColumnDefinition(MiniSqlParser.ColumnDefinitionContext ctx) {
        String columnName = ctx.NAME_IDENTIFIER().getText();
        Type type = ((TypeVisitResult) visit(ctx.type_identifier())).getType();
        boolean isUnique = ctx.UNIQUE() != null;
        Column column = new DefaultColumn(isUnique, columnName, type);
        return new ColumnDefinitionVisitResult(column);
    }

    @Override
    public ParseTreeVisitResult visitIntType(MiniSqlParser.IntTypeContext ctx) {
        return new TypeVisitResult(TypeFactory.generateIntType());
    }

    @Override
    public ParseTreeVisitResult visitFloatType(MiniSqlParser.FloatTypeContext ctx) {
        return new TypeVisitResult(TypeFactory.generateFloatType());
    }

    @Override
    public ParseTreeVisitResult visitCharNType(MiniSqlParser.CharNTypeContext ctx) {
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
            default:
                //error
                System.err.println("visit terminal error");
                return null;
        }
    }
}
