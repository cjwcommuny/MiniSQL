package common.type.implementation;

import common.type.IntType;
import error.StringLengthBeyondLimitException;
import lombok.Getter;

class DefaultIntType implements IntType {
    @Getter
    private static IntType instance = new DefaultIntType();

    private DefaultIntType() {}

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public boolean checkType(Object object) throws StringLengthBeyondLimitException {
        return object instanceof Integer;
    }
}
