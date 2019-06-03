package common.info;

import common.datastructure.Column;

public class ViolateUniquenessError implements OrdinaryInfo {
    private Column column;
    private Object key;

    public ViolateUniquenessError(Column column, Object key) {
        this.column = column;
        this.key = key;
    }

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return key + " at column " + column.getColumnName()+ " violates key uniqueness restriction";
    }
}
