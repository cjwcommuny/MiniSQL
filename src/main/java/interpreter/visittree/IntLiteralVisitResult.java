package interpreter.visittree;

import lombok.Getter;

public class IntLiteralVisitResult extends LiteralVisitResult {
    @Getter
    private Integer value;

    public IntLiteralVisitResult(int value) {
        this.value = value;
    }
}
