package interpreter;


import interpreter.antlrparser.MiniSqlLexer;
import interpreter.error.LexErrorListener;
import org.antlr.v4.runtime.*;

public class SqlLexer {
    private String instruction;

    public SqlLexer(String instruction) {
        this.instruction = instruction;
    }

    public CommonTokenStream tokenize() {
        Lexer lexer = new MiniSqlLexer(CharStreams.fromString(instruction));
        LexErrorListener lexListener = new LexErrorListener();
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        lexer.addErrorListener(lexListener);
        return new CommonTokenStream(lexer);
    }
}
