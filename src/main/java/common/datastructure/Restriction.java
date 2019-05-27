package common.datastructure;

import lombok.Getter;

import java.util.List;

@Getter
public class Restriction {
    private String columnName;
    private List<Condition> conditions;

    public Restriction(String columnName, List<Condition> conditions) {
        this.columnName = columnName;
        this.conditions = conditions;
    }
}
