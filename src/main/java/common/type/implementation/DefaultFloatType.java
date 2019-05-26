package common.type.implementation;

import common.type.FloatType;
import error.StringLengthBeyondLimitException;
import lombok.Getter;

class DefaultFloatType implements FloatType {
    @Getter
    private static FloatType instance = new DefaultFloatType();

    private DefaultFloatType() {}

    @Override
    public String toString() {
        return "float";
    }

    @Override
    public boolean checkType(Object object) throws StringLengthBeyondLimitException {
        return object instanceof Double;
    }

    @Override
    public int getSize() {
        return 8;
    }
}
