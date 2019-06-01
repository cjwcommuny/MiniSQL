package common.type;

import error.StringLengthBeyondLimitException;

import java.io.Serializable;

public interface Type extends Serializable {
    boolean checkType(Object object) throws StringLengthBeyondLimitException;
    int getSize();
}
