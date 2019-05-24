package interpreter.error;


import lombok.Getter;
import org.antlr.v4.misc.Utils;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class LexErrorListener extends BaseErrorListener {
    @Getter
    private final List<SyntaxError> syntaxErrors = new ArrayList<>();

    public int getLexErrorsCount() {
        return syntaxErrors.size();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        SyntaxError syntaxError = new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        syntaxErrors.add(syntaxError);
    }

    @Override
    public String toString() {
        return Utils.join(syntaxErrors.toArray(), "\n");
    }
}
