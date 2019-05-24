package common.type.implementation;

import common.type.CharNType;
import common.type.FloatType;
import lombok.Getter;

class DefaultFloatType implements FloatType {
    @Getter
    private static FloatType instance = new DefaultFloatType();

    private DefaultFloatType() {}

    @Override
    public String toString() {
        return "float";
    }
}
