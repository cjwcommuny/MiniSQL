package common.info;

import common.datastructure.restriction.Range;

public class IndexExistError implements OrdinaryInfo {
    private String tableName;
    private String indexName;

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return "index " + indexName + " in " + tableName + " already exists";
    }

    public IndexExistError(String tableName, String indexName) {
        this.tableName = tableName;
        this.indexName = indexName;
    }
}
