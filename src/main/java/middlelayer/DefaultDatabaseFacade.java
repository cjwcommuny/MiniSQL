package middlelayer;

import common.datastructure.Column;
import common.datastructure.Condition;
import common.datastructure.restriction.Restriction;
import common.info.Info;
import interpreter.api.DatabaseFacade;
import manager.FileHandler;

import java.util.*;

public class DefaultDatabaseFacade implements DatabaseFacade {
    private CatalogManager catalogManager;
    private IndexManager indexManager;
    private RecordManager recordManager;
    private FileHandler fileHandler;

    public DefaultDatabaseFacade(CatalogManager catalogManager, IndexManager indexManager, RecordManager recordManager, FileHandler fileHandler) {
        this.catalogManager = catalogManager;
        this.indexManager = indexManager;
        this.recordManager = recordManager;
        this.fileHandler = fileHandler;
    }

    @Override
    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
        return catalogManager.createTable(tableName, columns, primaryColumn);
    }

    @Override
    public List<Info> deleteTable(String tableName) {
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
    }

    @Override
    public List<Info> select(String tableName, List<Condition> conditions) {
        return recordManager.selectTuple(tableName, convertConditionsToRestrictions(conditions));
    }

    @Override
    public List<Info> quit() {
        var catalogInfos = catalogManager.quit();
        var fileHandlerInfos = fileHandler.quit();
        catalogInfos.addAll(fileHandlerInfos);
        return catalogInfos;
    }

    @Override
    public List<Info> executeFile(String fileName) {
        //do nothing
        return new LinkedList<>();
    }

    @Override
    public List<Info> insertTuple(String tableName, List<Object> values) {
        return recordManager.insertTuple(tableName, values);
    }

    @Override
    public List<Info> deleteTuple(String tableName, List<Condition> conditions) {
        return recordManager.deleteTuple(tableName, convertConditionsToRestrictions(conditions));
    }

    private static List<Restriction> convertConditionsToRestrictions(List<Condition> conditions) {
        Map<String, Restriction> restrictionMap = new HashMap<>();
        for (Condition condition: conditions) {
            String columnName = condition.getColumnName();
            Restriction restriction = restrictionMap.get(columnName);
            if (restriction == null) {
                restriction = new Restriction(columnName);
                restriction.addCondition(condition);
                restrictionMap.put(columnName, restriction);
            } else {
                restriction.addCondition(condition);
            }
        }
        return new LinkedList<>(restrictionMap.values());
    }
}
