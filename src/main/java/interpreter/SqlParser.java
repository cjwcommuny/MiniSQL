package interpreter;

import interpreter.antlrparser.MiniSqlParser;
import interpreter.error.SyntaxErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

public class SqlParser {
    private CommonTokenStream tokenStream;

    public SqlParser(CommonTokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    public ParseTree parse(boolean displayTree) {
        var parser = new MiniSqlParser(tokenStream);
//        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
//        parser.addErrorListener(new SyntaxErrorListener());
        if (displayTree) {
            new ParseTreeDisplayer(parser.instruction(), parser).display();
        }
        return parser.instructionWrap();
    }
}
