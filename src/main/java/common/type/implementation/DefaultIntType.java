package common.type.implementation;

import common.type.IntType;
import lombok.Getter;

class DefaultIntType implements IntType {
    @Getter
    private static IntType instance = new DefaultIntType();

    private DefaultIntType() {}

    @Override
    public String toString() {
        return "int";
    }
}
