package common.datastructure;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Restriction {
    private String columnName;
    private List<Condition> conditions = new LinkedList<>();

    public Restriction(String columnName) {
        this.columnName = columnName;
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }
}
