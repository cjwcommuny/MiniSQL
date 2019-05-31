package common.datastructure.implementation;

import common.datastructure.Column;
import common.datastructure.Index;
import common.datastructure.Table;

public class IndexFactory {
    public Index createIndex(String indexName, Table table, Column column) {
        return new DefaultIndex(column.getColumnName(), indexName);
    }

    public String generatePrimaryKeyIndexName(String tableName) {
        return "<" + tableName + "$Primary>";
    }
}
