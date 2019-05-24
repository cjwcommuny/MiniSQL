package interpreter.visittree;

import lombok.Getter;

public class PrimaryKeyVisitResult extends ParseTreeVisitResult {
    @Getter
    private String primaryKeyName;

    public PrimaryKeyVisitResult(String primaryKeyName) {
        this.primaryKeyName = primaryKeyName;
    }
}
