package common.datastructure.restriction;

import common.datastructure.Condition;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Restriction {
    private String columnName;
    private List<Condition> conditions = new LinkedList<>();

    private Object equationValue;
    private Range range = new Range();
    private boolean noRestriction;

    public Restriction(String columnName) {
        this.columnName = columnName;
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public boolean isEquationRestriction() {
        generateInternalForm();
        return equationValue == null;
    }

    private void generateInternalForm() {
        conditionLoop:
        for (var condition: conditions) {
            var compareType = condition.getCompareType();
            switch (compareType) {
                case EQUAL:
                    if (equationValue == null) {
                        equationValue = condition.getValue();
                    } else if (!equationValue.equals(condition.getValue())) {
                        //equation conflicts
                        noRestriction = true;
                        break conditionLoop;
                    }
                    break;
                case NOT_EQUAL:

                    break;
                case LESS:
                    break;
                case GREATER:
                    break;
                case LESS_OR_EQUAL:
                    break;
                case GREATER_OR_EQUAL:
                    break;
            }
        }
    }

    private void handle
}
