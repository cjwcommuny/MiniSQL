package common.type.implementation;

import common.type.CharNType;
import lombok.Getter;

class DefaultCharNType implements CharNType {
    @Getter
    private int length;

    DefaultCharNType(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "char(" + length + ")";
    }
}
