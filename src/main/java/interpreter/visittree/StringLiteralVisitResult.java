package interpreter.visittree;

import lombok.Getter;

public class StringLiteralVisitResult extends LiteralVisitResult {
    @Getter
    private String value;

    public StringLiteralVisitResult(String value) {
        this.value = value;
    }
}
