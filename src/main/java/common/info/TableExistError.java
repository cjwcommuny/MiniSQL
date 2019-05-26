package common.info;

public class TableExistError implements OrdinaryInfo {
    private String tableName;

    public TableExistError(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return "table already exists: " + tableName;
    }
}
