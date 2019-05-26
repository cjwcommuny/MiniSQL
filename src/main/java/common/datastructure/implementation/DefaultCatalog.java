package common.datastructure.implementation;

import common.datastructure.Catalog;
import common.datastructure.Column;
import lombok.Getter;

import java.util.List;

@Getter
public class DefaultCatalog implements Catalog {
    private String tableName;
    private List<Column> columns;
    private Column primaryKey;

    public DefaultCatalog(String tableName, List<Column> columns, Column primaryKey) {
        this.tableName = tableName;
        this.columns = columns;
        this.primaryKey = primaryKey;
    }
}
