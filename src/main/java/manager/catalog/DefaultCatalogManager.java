package manager.catalog;

import common.datastructure.Column;
import common.info.Info;
import manager.TableManager;
import middlelayer.CatalogManager;

import java.util.List;

public class DefaultCatalogManager implements CatalogManager {
    private TableManager tableManager = TableManager.getInstance();

    @Override
    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
        return tableManager.createTable(tableName, columns, primaryColumn);
    }

    @Override
    public List<Info> deleteTable(String tableName) {
        return tableManager.deleteTable(tableName);
    }
}
