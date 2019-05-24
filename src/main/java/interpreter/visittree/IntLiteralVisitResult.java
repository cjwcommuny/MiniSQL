package interpreter.visittree;

import lombok.Getter;

public class IntLiteralVisitResult extends ParseTreeVisitResult {
    @Getter
    private int value;

    public IntLiteralVisitResult(int value) {
        this.value = value;
    }
}
