package common.type;

import error.StringLengthBeyondLimitException;

public interface Type {
    boolean checkType(Object object) throws StringLengthBeyondLimitException;
    int getSize();
}
