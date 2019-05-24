package interpreter;

import common.info.Info;
import main.Interpreter;
import org.antlr.v4.automata.ATNFactory;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DefaultInterpreter implements Interpreter {
    public void interpret() {
        handleInstructions(System.in);
    }

    CommonTokenStream lexSingleInstruction(String instruction) {
        SqlLexer sqlLexer = new SqlLexer(instruction);
        var tokenStream = sqlLexer.tokenize();
        return tokenStream;
    }

    private void handleInstructions(InputStream stream) {
        var scanner = new Scanner(stream);
        scanner.useDelimiter(Pattern.compile(";"));
        while (scanner.hasNext()) {
            String instruction = scanner.next();
            handleSingleInstruction(instruction);
        }
    }

    private void handleSingleInstruction(String instruction) {
        CommonTokenStream tokenStream = lexSingleInstruction(instruction);
        var parseTree = new SqlParser(tokenStream).parse(false);
        var parseTreeVisitResult = new ParseTreeInterpreter().visit(parseTree);
        var infos = parseTreeVisitResult.getInfos();
        for (Info info: infos) {
            System.out.println(info.toString());
        }
    }
}
