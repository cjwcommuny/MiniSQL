package common.info;

import common.type.Type;

public class TypeMismatchError implements OrdinaryInfo {
    private Type typeExpected;
    private Object value;

    public TypeMismatchError(Type typeExpected, Object value) {
        this.typeExpected = typeExpected;
        this.value = value;
    }

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return "type mismatch: expect type: " + typeExpected + ", value: " + value;
    }
}
