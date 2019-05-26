package common.type.implementation;

import common.type.CharNType;
import error.StringLengthBeyondLimitException;
import lombok.Getter;

class DefaultCharNType implements CharNType {
    @Getter
    private int length;

    DefaultCharNType(int length) {
        this.length = length;
    }

    @Override
    public String constructStr(byte[] bytes) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean checkType(Object object) throws StringLengthBeyondLimitException {
        if (!(object instanceof String)) {
            return false;
        }
        String str = (String) object;
        if (str.length() > length) {
            throw new StringLengthBeyondLimitException();
        }
        return true;
    }

    @Override
    public String toString() {
        return "char(" + length + ")";
    }
}
