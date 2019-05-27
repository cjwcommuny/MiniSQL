package manager.record;

import common.datastructure.*;
import common.datastructure.implementation.TupleFactory;
import common.info.Info;
import common.info.StringLengthExcessLimitError;
import common.info.TableNotExistError;
import common.info.TypeMismatchError;
import common.type.Type;
import error.StringLengthBeyondLimitException;
import file.buffer.DefaultBufferManager;
import manager.FileHandler;
import manager.TableManager;
import manager.index.DefaultIndexManager;
import middlelayer.IndexManager;
import middlelayer.RecordManager;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DefaultRecordManager implements RecordManager {
    private TableManager tableManager = TableManager.getInstance();
    private FileHandler fileHandler = DefaultBufferManager.getInstance();
    private IndexManager indexManager = DefaultIndexManager.getInstance();

    private TupleFactory tupleFactory = new TupleFactory();

    @Override
    public List<Info> insertTuple(String tableName, List<Object> values) {
        List<Info> infos = new LinkedList<>();

        //check
        var table = tableManager.getTable(tableName);
        if (table == null) {
            infos.add(new TableNotExistError(tableName));
            return infos;
        }
        List<Type> types = table.getTypes();
        boolean typesMatch = checkTypesMatch(values, types, infos);
        if (!typesMatch) {
            return infos;
        }

        //insert
        Tuple tuple = tupleFactory.createTuple(values);
        int offset = table.getOffset();
        table.incrementTupleCount();
        byte[] tupleBytes = tuple.toBytes(table.getTypes(), table.getTupleSize());
        fileHandler.writeTupleToFile(tupleBytes, tableName, offset);
//        indexManager.updateIndexes(tuple, table, offset);TODO
        return infos;
    }

    @Override
    public List<Info> deleteTuple(String tableName, List<Restriction> restrictions) {
        List<Info> infos = new LinkedList<>();
        var table = tableManager.getTable(tableName);
        if (table == null) {
            infos.add(new TableNotExistError(tableName));
            return infos;
        }
        Set<Integer> offsetsIntersection = new HashSet<>();
        var noIndexRestrictions = searchByIndex(restrictions, table, offsetsIntersection);
        var tuples = searchLinearly(new LinkedList<>(offsetsIntersection), noIndexRestrictions);
        updateIndexes(table, tuples);
        //TODO
//        table.deleteTuple(conditions);
//        return infos;
        throw new UnsupportedOperationException();
    }

    private List<Restriction> searchByIndex(List<Restriction> originalrRestrictions, Table table , Set<Integer> OUT_offsetsIntersection) {
        List<Restriction> noIndexRestrictions = new LinkedList<>();
        for (Restriction restriction: originalrRestrictions) {
            String columnName = restriction.getColumnName();
            Index index = table.getIndex(columnName);
            if (index == null) {
                //not exist index in this column
                noIndexRestrictions.add(restriction);
            } else {
                //TODO: 当table很大时可采用并发查找
                List<Integer> offsets = index.getTupleIndex(restriction);
                OUT_offsetsIntersection.addAll(offsets);
            }
        }
        return noIndexRestrictions;
    }

    private List<Tuple> searchLinearly(List<Integer> offsets, List<Restriction> restrictions) {
        //TODO
        throw new UnsupportedOperationException();
    }

    private void updateIndexes(Table table, List<Tuple> tuples) {
        //TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Info> selectTuple(String tableName, List<Restriction> restrictions) {
        throw new UnsupportedOperationException();
    }

    private boolean checkTypesMatch(List<Object> values, List<Type> types, List<Info> outInfos) {
        boolean result = true;
        for (int i = 0; i < values.size(); ++i) {
            var value = values.get(i);
            var type = types.get(i);
            try {
                boolean isThisType = type.checkType(value);
                if (!isThisType) {
                    result = false;
                    outInfos.add(new TypeMismatchError(type, value));
                }
            } catch (StringLengthBeyondLimitException e) {
                outInfos.add(new StringLengthExcessLimitError(value));
            }
        }
        return result;
    }
}
