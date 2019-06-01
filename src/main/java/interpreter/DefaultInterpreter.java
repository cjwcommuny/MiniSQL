package interpreter;

import common.info.Info;
import interpreter.api.DatabaseFacade;
import interpreter.error.ParseException;
import interpreter.error.QuitException;
import interpreter.visittree.InstructionVisitResult;
import main.Interpreter;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DefaultInterpreter implements Interpreter {
    private static final String PROMPT = ">>> ";
    private static final String QUIT_MESSAGE = "Bye.";
    private DatabaseFacade database;

    public DefaultInterpreter(DatabaseFacade database) {
        this.database = database;
    }

    public void interpret() {
        handleInstructions(System.in, System.out, true);
    }

    CommonTokenStream lexSingleInstruction(String instruction) {
        SqlLexer sqlLexer = new SqlLexer(instruction);
        var tokenStream = sqlLexer.tokenize();
        return tokenStream;
    }

    void handleInstructions(InputStream inputStream, PrintStream printStream, boolean displayPrompt) {
        var scanner = new Scanner(inputStream);
        scanner.useDelimiter(Pattern.compile(";"));
        if (displayPrompt) {
            printStream.print(PROMPT);
        }
        while (scanner.hasNext()) {
            String instruction = scanner.next();
            try {
                handleSingleInstruction(instruction, printStream);
            } catch (QuitException e) {
                printStream.println(QUIT_MESSAGE);
                return;
            }
            if (displayPrompt) {
                printStream.print(PROMPT);
            }
        }
    }

    private void handleSingleInstruction(String instruction, PrintStream printStream) {
        CommonTokenStream tokenStream = lexSingleInstruction(instruction);
        var parseTree = new SqlParser(tokenStream).parse(false);
        try {
            var parseTreeVisitResult =
                    new ParseTreeInterpreter(this, database, printStream).visit(parseTree);
            var infos = ((InstructionVisitResult) parseTreeVisitResult).getInfos();
            for (Info info: infos) {
                printStream.println(info.getFormatMessage());
            }
        } catch (ParseException e) {
            for (var info: e.getInfos()) {
                printStream.println(info.getFormatMessage());
            }
        }
    }
}
