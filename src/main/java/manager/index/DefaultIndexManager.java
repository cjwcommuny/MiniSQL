package manager.index;

import common.datastructure.Index;
import common.datastructure.Pair;
import common.datastructure.Table;
import common.datastructure.Tuple;
import common.datastructure.implementation.IndexFactory;
import common.datastructure.restriction.Restriction;
import common.info.ColumnNotExistError;
import common.info.IndexExistError;
import common.info.Info;
import common.info.TableNotExistError;
import file.buffer.DefaultBufferManager;
import lombok.Getter;
import manager.FileHandler;
import manager.TableManager;
import middlelayer.IndexManager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DefaultIndexManager implements IndexManager {
    private static TableManager tableManager = TableManager.getInstance();
    private static IndexFactory indexFactory = new IndexFactory();

    @Getter
    private static IndexManager instance = new DefaultIndexManager();

    private FileHandler fileHandler = DefaultBufferManager.getInstance();

    //indexName -> <Index, Table>
//    private Map<String, Pair<Index, Table>> indexMap = new HashMap<>();

    private DefaultIndexManager() {
    }

    @Override
    public void updateIndexes(Tuple tuple, Table table, int offset) {
        for (var entry: table.getIndexesMap().entrySet()) {
            String columnName = entry.getKey();
            int columnIndex = table.getColumnIndex(columnName);
            Index index = entry.getValue();
            index.update(tuple.getValue(columnIndex), offset);
        }
//        writeIndex(); //TODO
    }

    private void writeIndex() {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Integer> getOffsets(List<Restriction> restrictions, Table table) {
        List<Integer> result = new LinkedList<>();
        for (var restriction: restrictions) {
            String columnName = restriction.getColumnName();
            Index index = table.getIndex(columnName);
            result.addAll(index.getTuplesIndex(restriction));
        }
        return result;
    }

    @Override
    public void deleteOffsets(List<Tuple> tuples, Table table) {
        for (var tuple: tuples) {
            for (int columnIndex = 0; columnIndex < tuple.getSize(); ++columnIndex) {
                var index = table.getIndex(table.getColumnName(columnIndex));
                if (index != null) {
                    index.delete(tuple.getValue(columnIndex));
                }
            }
        }
    }

    @Override
    public List<Info> createIndex(String indexName, String tableName, String columnName) {
        List<Info> infos = new LinkedList<>();
        Table table = tableManager.getTable(tableName);

        //check
        if (table == null) {
            infos.add(new TableNotExistError(tableName));
            return infos;
        }
        if (!table.existColumn(columnName)) {
            infos.add(new ColumnNotExistError(tableName, columnName));
            return infos;
        }
        Table tableHasThisIndex = getTableByIndex(indexName);
        if (tableHasThisIndex != null) {
            infos.add(new IndexExistError(tableHasThisIndex.getTableName(), indexName));
            return infos;
        }


        //create
//        Index index = indexFactory.createIndex(indexName, table, table.getColumn(columnName));
        throw new UnsupportedOperationException();//TODO
    }

    @Override
    public List<Info> deleteIndex(String indexName) {
        List<Info> infos = new LinkedList<>();
        Table table = getTableByIndex(indexName);
        if (table == null) {
            infos.add(new TableNotExistError("table of " + indexName));
            return infos;
        }
        table.deleteIndex(indexName);
        return infos;
    }

    private Table getTableByIndex(String indexName) {
        for (var table: tableManager.getAllTables()) {
            if (table.existIndex(indexName)) {
                return table;
            }
        }
        return null;
    }
}
