package interpreter.visittree;

import common.Condition;
import lombok.Getter;

import java.util.List;

public class ConditionsVisitResult extends ParseTreeVisitResult {
    @Getter
    private List<Condition> conditions;

    public ConditionsVisitResult(List<Condition> conditions) {
        this.conditions = conditions;
    }
}
