package common.implementation;

import common.Column;
import common.Index;
import common.Table;
import common.Tuple;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
class DefaultTable implements Table  {
    private String tableName;
    private List<Column> columns;
    private Column primaryKey;
    private List<Tuple> data;

    @Setter
    private Index index;

    public DefaultTable(String tableName, List<Column> columns, Column primaryKey) {
        this.tableName = tableName;
        this.columns = columns;
        this.primaryKey = primaryKey;
    }

    @Override
    public int getColumnsCount() {
        return columns.size();
    }
}
