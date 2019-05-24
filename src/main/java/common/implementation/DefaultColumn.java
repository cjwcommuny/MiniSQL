package common.implementation;

import common.Column;
import common.type.Type;
import lombok.Getter;

@Getter
public class DefaultColumn implements Column {
    private boolean unique;
    private String columnName;
    private Type type;

    public DefaultColumn(boolean unique, String columnName, Type type) {
        this.unique = unique;
        this.columnName = columnName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Column: {" + columnName + ", " + type + ", " + "unique=" + unique + "}";
    }
}
