package interpreter.visittree;

import lombok.Getter;

public class FloatLiteralVisitResult extends LiteralVisitResult {
    @Getter
    private Double value;

    public FloatLiteralVisitResult(double value) {
        this.value = value;
    }
}
