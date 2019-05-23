package common;

import common.type.Type;

public interface Column {
    boolean isPrimary();
    boolean isUnique();
    String getColumnName();
    Type getType();
}
