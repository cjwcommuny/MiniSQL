package common.info;

import common.datastructure.restriction.Range;

public class ColumnNotExistError implements OrdinaryInfo {
    private String tableName;
    private String columnName;

    public ColumnNotExistError(String tableName, String columnName) {
        this.tableName = tableName;
        this.columnName = columnName;
    }

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return "column name " + columnName + " not exits in table: " + tableName;
    }
}
