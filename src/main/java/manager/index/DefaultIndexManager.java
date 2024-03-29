package manager.index;

import common.datastructure.*;
import common.datastructure.implementation.IndexFactory;
import common.datastructure.restriction.Restriction;
import common.info.ColumnNotExistError;
import common.info.IndexExistError;
import common.info.Info;
import common.info.TableNotExistError;
import common.type.CharNType;
import common.type.FloatType;
import common.type.IntType;
import common.type.Type;
import file.buffer.DefaultBufferManager;
import lombok.Getter;
import manager.FileHandler;
import manager.TableManager;
import middlelayer.IndexManager;

import java.nio.charset.StandardCharsets;
import java.util.*;

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
        Index index = indexFactory.createIndex(indexName, table, table.getColumn(columnName));
        table.addIndex(index, columnName, indexName);
        buildIndexFromRecords(index, table);
        return infos;
    }

    private void buildIndexFromRecords(Index index, Table table) {
        String tableName = table.getTableName();
        int tuplesCount = table.getTuplesCount();
        int tupleSize = table.getTupleSize();
        int columnIndex = table.getColumnIndex(index.getColumnName());
        var types = table.getTypes();
        Type type = types.get(columnIndex);
        int correspondingTypeSize = type.getSize();
        int offset = getOffsetWithinTuple(types, columnIndex);
        Set<Integer> freePositions = new HashSet<>(table.getFreeTuplePositions());

        int tupleNum = 0;
        int tupleIndex = 0;
        while (tupleNum < tuplesCount) {
            if (freePositions.contains(tupleIndex)) {
                tupleIndex += 1;
                continue;
            }
            int base = tupleIndex * tupleSize;
            ByteCarrier byteCarrier = fileHandler.readTupleBytes(tableName,
                    base + offset, correspondingTypeSize);
            Object key = byteCarrier.getObject(base + offset,
                    correspondingTypeSize, type);
            index.update(key, base);
            tupleNum += 1;
            tupleIndex += 1;
        }

//        for (int tupleIndex = 0; tupleIndex < tuplesCount; ++tupleIndex) {
//            int base = tupleIndex * tupleSize;
//            ByteCarrier byteCarrier = fileHandler.readTupleBytes(tableName,
//                    base + offset, correspondingTypeSize);
//            Object key = byteCarrier.getObject(base + offset,
//                    correspondingTypeSize, type);
////            System.out.println(key); //for debug
//            index.update(key, base);
//        }
    }

    private int getOffsetWithinTuple(List<Type> types, int columnIndex) {
        int result = 0;
        for (int i = 0; i < columnIndex; ++i) {
            result += types.get(i).getSize();
        }
        return result;
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

    @Override
    public boolean violatePrimaryKey(Table table, Tuple tuple) {
        Column primaryColumn = table.getPrimaryKey();
        Object key = tuple.getValue(table.getColumnIndex(primaryColumn.getColumnName()));
        Index index = table.getPrimaryIndex();
        return index.exist(key);
    }
}
