package common.info;

public class TableNotExistError implements OrdinaryInfo {
    private String tableName;

    public TableNotExistError(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return "Table not exist: " + tableName;
    }
}
