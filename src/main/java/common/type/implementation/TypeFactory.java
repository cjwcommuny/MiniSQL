package common.type.implementation;

import common.type.CharNType;
import common.type.FloatType;
import common.type.IntType;

public class TypeFactory {
    public static CharNType generateCharNType(int length) {
        return new DefaultCharNType(length);
    }

    public static IntType generateIntType() {
        return DefaultIntType.getInstance();
    }

    public static FloatType generateFloatType() {
        return DefaultFloatType.getInstance();
    }
}
