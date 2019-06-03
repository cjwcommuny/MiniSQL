package common.type.implementation;

import common.type.CharNType;
import error.StringLengthBeyondLimitException;
import lombok.Getter;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class DefaultCharNType implements CharNType {
    private static int CHAR_SIZE = 2;
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

    @Override
    public int getSize() {
        return length * 2;
    }
}
