package middlelayer;

import common.datastructure.Column;
import common.datastructure.Condition;
import common.datastructure.restriction.Restriction;
import common.info.Info;
import common.info.SuccessInfo;
import interpreter.api.DatabaseFacade;
import manager.FileHandler;

import java.util.*;
import java.util.concurrent.TransferQueue;

public class DatabaseFacadeImpl implements DatabaseFacade {
    private CatalogManager catalogManager;
    private IndexManager indexManager;
    private RecordManager recordManager;
    private FileHandler fileHandler;

    public DatabaseFacadeImpl(CatalogManager catalogManager, IndexManager indexManager, RecordManager recordManager, FileHandler fileHandler) {
        this.catalogManager = catalogManager;
        this.indexManager = indexManager;
        this.recordManager = recordManager;
        this.fileHandler = fileHandler;
        init();
    }

    private void init() {
        catalogManager.init();
        fileHandler.init();
    }

    @Override
    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
        List<Info> infos = catalogManager.createTable(tableName, columns, primaryColumn);
        if (infos.size() == 0) {
            infos.add(new SuccessInfo());
        }
        return infos;
    }

    @Override
    public List<Info> deleteTable(String tableName) {
        List<Info> infos = catalogManager.deleteTable(tableName);
        if (infos.size() == 0) {
            infos.add(new SuccessInfo());
        }
        return infos;
    }

    @Override
    public List<Info> createIndex(String indexName, String tableName, String columnName) {
        var infos = indexManager.createIndex(indexName, tableName, columnName);
        if (infos.size() == 0) {
            infos.add(new SuccessInfo());
        }
        return infos;
    }

    @Override
    public List<Info> deleteIndex(String indexName) {
        var infos = indexManager.deleteIndex(indexName);
        if (infos.size() == 0) {
            infos.add(new SuccessInfo());
        }
        return infos;
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
        var infos = recordManager.insertTuple(tableName, values);
        if (infos.size() == 0) {
            infos.add(new SuccessInfo());
        }
        return infos;
    }

    @Override
    public List<Info> deleteTuple(String tableName, List<Condition> conditions) {
        var infos = recordManager.deleteTuple(tableName, convertConditionsToRestrictions(conditions));
        if (infos.size() == 0) {
            infos.add(new SuccessInfo());
        }
        return infos;
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
