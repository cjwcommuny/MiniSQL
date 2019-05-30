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
    private List<Object> notEqualValues = new LinkedList<>();
    private Range range = new Range(Range.getMinValue(),
            Range.getMaxValue(), true, true);
    private boolean noRestriction;

    public Restriction(String columnName) {
        this.columnName = columnName;
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public boolean isEquationRestriction() {
        return equationValue == null;
    }

    public void generateInternalForm() {
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
                    notEqualValues.add(condition.getValue());
                    break;
                case LESS:
                    range = range.intersect(new Range(Range.getMinValue(),
                            condition.getValue(),
                            true, true));
                    break;
                case GREATER:
                    range = range.intersect(new Range(condition.getValue(),
                            Range.getMaxValue(),
                            true, true));
                    break;
                case LESS_OR_EQUAL:
                    range = range.intersect(new Range(Range.getMinValue(),
                            condition.getValue(),
                            true, false));
                    break;
                case GREATER_OR_EQUAL:
                    range = range.intersect(new Range(condition.getValue(),
                            Range.getMaxValue(),
                            false, true));
                    break;
            }
        }
    }
}
