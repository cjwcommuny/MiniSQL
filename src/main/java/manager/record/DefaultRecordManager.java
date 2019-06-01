package manager.record;

import common.datastructure.*;
import common.datastructure.implementation.TupleFactory;
import common.datastructure.restriction.Range;
import common.datastructure.restriction.Restriction;
import common.info.*;
import common.type.Type;
import error.MiniSqlAbortException;
import error.StringLengthBeyondLimitException;
import file.buffer.DefaultBufferManager;
import manager.FileHandler;
import manager.TableManager;
import manager.index.DefaultIndexManager;
import middlelayer.IndexManager;
import middlelayer.RecordManager;

import java.util.*;

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
        int tupleIndex = table.addTuple();
        int offset = tupleIndex * table.getTupleSize();
        byte[] tupleBytes = tuple.toBytes(table.getTypes(), table.getTupleSize());
        fileHandler.writeTupleToFile(tupleBytes, tableName, offset);
        indexManager.updateIndexes(tuple, table, offset);
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
        List<Integer> offsetsFiltered = new ArrayList<>();
        try {
            var tuples = getTuplesAndOffsets(table, restrictions, offsetsFiltered);
            indexManager.deleteOffsets(tuples, table);
            deleteTuplesFromFile(offsetsFiltered, table);
            return infos;
        } catch (MiniSqlAbortException e) {
            infos.addAll(e.getInfos());
            return infos;
        }
    }

    private List<Tuple> getTuplesAndOffsets(Table table,
                                            List<Restriction> restrictions,
                                            List<Integer> OUT_offsets) throws MiniSqlAbortException {
        Set<Integer> offsetsIntersection = new HashSet<>(); //offsets stored in index
        var noIndexRestrictions = searchByIndex(restrictions, table, offsetsIntersection);
        var tuples = getTuplesFromFile(offsetsIntersection, table);
        OUT_offsets.addAll(offsetsIntersection);
        filterTuplesAndOffsetsByRestrictions(OUT_offsets, tuples, noIndexRestrictions, table);
        return tuples;
    }

    private void deleteTuplesFromFile(Collection<Integer> offsets, Table table) {
        //lazy delete
        for (int i: offsets) {
            table.deleteTuple(i);
        }
    }

    private void filterTuplesAndOffsetsByRestrictions(List<Integer> OUT_offsets,
                                                      List<Tuple> OUT_tuples,
                                                      List<Restriction> restrictions,
                                                      Table table) {
        for (int i = OUT_tuples.size() - 1; i >= 0; --i) {
            var tuple = OUT_tuples.get(i);
            boolean satisfyRestrictions = true;
            for (var restriction: restrictions) {
                var columnName = restriction.getColumnName();
                var key = tuple.getValue(table.getColumnIndex(columnName));
                if (!restriction.satisfy(key)) {
                    satisfyRestrictions = false;
                    break;
                }
            }
            if (!satisfyRestrictions) {
                OUT_offsets.remove(i);
                OUT_tuples.remove(i);
            }
        }
    }

    @Override
    public List<Info> selectTuple(String tableName, List<Restriction> restrictions) {
        List<Info> infos = new LinkedList<>();
        var table = tableManager.getTable(tableName);
        if (table == null) {
            infos.add(new TableNotExistError(tableName));
            return infos;
        }
        List<Integer> offsetsFiltered = new ArrayList<>();
        try {
            var tuples = getTuplesAndOffsets(table, restrictions, offsetsFiltered);
            infos.add(new ResultInfo(table.getColumns(), tuples));
            return infos;
        } catch (MiniSqlAbortException e) {
            infos.addAll(e.getInfos());
            return infos;
        }
    }

    private List<Restriction> searchByIndex(List<Restriction> originalRestrictions,
                                            Table table ,
                                            Set<Integer> OUT_offsetsIntersection) throws MiniSqlAbortException {
        List<Restriction> noIndexRestrictions = new LinkedList<>();
        for (Restriction restriction: originalRestrictions) {
            String columnName = restriction.getColumnName();
            if (!table.existColumn(columnName)) {
                throw new MiniSqlAbortException(Collections.singletonList(
                        new ColumnNotExistError(table.getTableName(), columnName))
                );
            }
            Index index = table.getIndex(columnName);
            if (index == null) {
                //not exist index in this column
                noIndexRestrictions.add(restriction);
            } else {
                //TODO: 当table很大时可采用并发查找
                List<Integer> offsets = index.getTuplesIndex(restriction);
                OUT_offsetsIntersection.addAll(offsets);
            }
        }
        if (noIndexRestrictions.size() == originalRestrictions.size()) {
            //not exist index restriction
            OUT_offsetsIntersection.addAll(table.getPrimaryIndex().getTuplesIndex(Range.generateTotalRange()));
        }
        return noIndexRestrictions;
    }

    private List<Tuple> getTuplesFromFile(Collection<Integer> offsets, Table table) {
        //TODO: buffer
        byte[] records = fileHandler.readTuples(table.getTableName());
        List<Tuple> tuples = new ArrayList<>();
        for (int offset: offsets) {
            tuples.add(table.bytesToTuple(records, offset));
        }
        return tuples;
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
