package common.datastructure.implementation;

import common.datastructure.Column;
import common.datastructure.Table;

import java.util.List;

public class TableFactory {
    public Table createTable(String tableName, List<Column> columns, Column primaryColumn) {
        return new DefaultTable(tableName, columns, primaryColumn);
    }
}
