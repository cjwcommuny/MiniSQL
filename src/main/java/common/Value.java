package common;

import common.type.Type;

public interface Value {
    Type getType();
    Object getValue();
}
