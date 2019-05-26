package manager;

import common.datastructure.Column;
import common.datastructure.Table;
import common.datastructure.implementation.TableFactory;
import common.info.Info;
import common.info.TableExistError;
import common.info.TableNotExistError;
import lombok.Getter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TableManager {
    TableFactory tableFactory = new TableFactory();

    @Getter
    private static TableManager instance = new TableManager();

    private TableManager() {}

    private Map<String, Table> tableMap = new HashMap<>();

    private boolean exist(String tableName) {
        return tableMap.containsKey(tableName);
    }

    public List<Info> deleteTable(String tableName) {
        if (!exist(tableName)) {
            List<Info> infos = new LinkedList<>();
            infos.add(new TableNotExistError(tableName));
            return infos;
        }
        tableMap.remove(tableName);
        return new LinkedList<>();
    }

    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
        if (exist(tableName)) {
            List<Info> infos = new LinkedList<>();
            infos.add(new TableExistError(tableName));
            return infos;
        }
        Table table = tableFactory.createTable(tableName, columns, primaryColumn);
        tableMap.put(tableName, table);
        return new LinkedList<>();
    }

    public Table getTable(String tableName) {
        return tableMap.get(tableName);
    }
}
