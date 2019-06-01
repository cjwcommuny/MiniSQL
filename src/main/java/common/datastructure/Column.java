package common.datastructure;

import common.type.Type;

import java.io.Serializable;

public interface Column extends Serializable {
    boolean isUnique();
    String getColumnName();
    Type getType();
    String visualInfo();
}
