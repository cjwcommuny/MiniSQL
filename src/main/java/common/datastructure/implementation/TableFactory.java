package common.datastructure.implementation;

import common.datastructure.Column;
import common.datastructure.Index;
import common.datastructure.Table;

import java.util.List;

public class TableFactory {
    private IndexFactory indexFactory = new IndexFactory();

    public Table createTable(String tableName, List<Column> columns, Column primaryColumn) {
        var table =  new DefaultTable(tableName, columns, primaryColumn);
        String primaryIndexName = indexFactory.generatePrimaryKeyIndexName(tableName);
        Index primaryIndex = indexFactory.createIndex(primaryIndexName, table, primaryColumn);
        table.putIndex(primaryIndex);
        return table;
    }
}
