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
//        System.out.println(tableName);
//        return new LinkedList<>();
        return catalogManager.deleteTable(tableName);
    }

    @Override
    public List<Info> createIndex(String indexName, String tableName, String columnName) {
//        System.out.println(indexName);
//        System.out.println(tableName);
//        System.out.println(columnName);
//        return new LinkedList<>();
        return null;
    }

    @Override
    public List<Info> deleteIndex(String indexName) {
        System.out.println(indexName);
        return new LinkedList<>();
//        return null;
    }

    @Override
    public List<Info> select(String tableName, List<Condition> conditions) {
        System.out.println(tableName);
        System.out.println(conditions);
        return new LinkedList<>();
//        return null;
    }

    @Override
    public List<Info> quit() {
        return new LinkedList<>();
    }

    @Override
    public List<Info> executeFile(String fileName) {
        //do nothing
        return new LinkedList<>();
    }

    @Override
    public List<Info> insertTuple(String tableName, List<Object> values) {
        System.out.println(tableName);
        System.out.println(values);
        return new LinkedList<>();
//        return null;
    }

    @Override
    public List<Info> deleteTuple(String tableName, List<Condition> conditions) {
        System.out.println(tableName);
        System.out.println(conditions);
        return new LinkedList<>();
//        return null;
    }
}
