package interpreter.visittree;

import common.datastructure.Condition;
import lombok.Getter;

public class ConditionVisitResult extends ParseTreeVisitResult {
    @Getter
    private Condition condition;

    public ConditionVisitResult(Condition condition) {
        this.condition = condition;
    }
}
