package interpreter;

import interpreter.antlrparser.MiniSqlParser;
import main.Interpreter;

public class DefaultInterpreter implements Interpreter {
    public void interpret() {

    }

    public void parseSingleInstruction(String instruction) {
        final boolean displayTree = true;

        SqlLexer sqlLexer = new SqlLexer(instruction);
        var tokenStream = sqlLexer.tokenize();
        if (displayTree) {
            var parser = new MiniSqlParser(tokenStream);
            new ParseTreeDisplayer(parser.instruction(), parser).display();
        }
    }
}
