package common.datastructure;

import common.type.Type;

import java.util.List;

public interface Tuple {
    Object getValue(int index);
    void setValue(int index, Object value);
    byte[] toBytes(List<Type> types, int size);
    int getSize();
    String visualInfo();
}
