package manager.catalog;

import common.Column;
import common.info.Info;
import middlelayer.CatalogManager;

import java.util.List;

public class DefaultCatalogManager implements CatalogManager {


    @Override
    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
        return null;
    }

    @Override
    public List<Info> deleteTable(String tableName) {
        return null;
    }
}
