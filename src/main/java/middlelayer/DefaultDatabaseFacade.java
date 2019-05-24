package middlelayer;

import common.Column;
import common.Condition;
import common.info.Info;
import interpreter.api.DatabaseFacade;

import java.util.LinkedList;
import java.util.List;

public class DefaultDatabaseFacade implements DatabaseFacade {
    private CatalogManager catalogManager;
    private IndexManager indexManager;
    private RecordManager recordManager;

    public DefaultDatabaseFacade(CatalogManager catalogManager, IndexManager indexManager, RecordManager recordManager) {
        this.catalogManager = catalogManager;
        this.indexManager = indexManager;
        this.recordManager = recordManager;
    }

    @Override
    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
//        System.out.println(tableName);
//        System.out.println(columns);
//        System.out.println(primaryColumn);
//        return new LinkedList<>();
        return catalogManager.createTable(tableName, columns, primaryColumn);
    }

    @Override
    public List<Info> deleteTable(String tableName) {
        System.out.println(tableName);
        return new LinkedList<>();
//        return catalogManager.deleteTable(tableName);
    }

    @Override
    public List<Info> createIndex(String indexName, String tableName, String columnName) {
        return null;
    }

    @Override
    public List<Info> deleteIndex(String indexName) {
        return null;
    }

    @Override
    public List<Info> select(String tableName, List<Condition> conditions) {
        return null;
    }

    @Override
    public List<Info> quit() {
        return null;
    }

    @Override
    public List<Info> executeFile(String fileName) {
        return null;
    }
}
