package common.datastructure;

import common.type.Type;

public interface Column {
    boolean isUnique();
    String getColumnName();
    Type getType();
}
