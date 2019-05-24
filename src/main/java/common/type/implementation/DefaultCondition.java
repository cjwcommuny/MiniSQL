package common.type.implementation;

import common.Condition;
import lombok.Getter;

@Getter
public class DefaultCondition implements Condition {
    ConditionType compareType;
    String columnName;
    Object value;

    public DefaultCondition(ConditionType compareType, String columnName, Object value) {
        this.compareType = compareType;
        this.columnName = columnName;
        this.value = value;
    }

    @Override
    public String toString() {
        return columnName + " " + compareType + " " + value;
    }
}
