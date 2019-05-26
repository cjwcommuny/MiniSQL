package manager.record;

import common.datastructure.Condition;
import common.datastructure.Index;
import common.datastructure.Table;
import common.datastructure.Tuple;
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

import java.util.LinkedList;
import java.util.List;

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
        int offset = table.getTupleSize();
        byte[] tupleBytes = tuple.toBytes(table.getTypes(), table.getTupleSize());
        fileHandler.writeTupleToFile(tupleBytes, tableName, offset);
        indexManager.updateIndexes(tuple, table, offset);
        return infos;
    }



    @Override
    public List<Info> deleteTuple(String tableName, List<Condition> conditions) {
        List<Info> infos = new LinkedList<>();
        var table = tableManager.getTable(tableName);
        if (table == null) {
            infos.add(new TableNotExistError(tableName));
            return infos;
        }
        table.deleteTuple(conditions);
        return infos;
    }

    @Override
    public List<Info> selectTuple(String tableName, List<Condition> conditions) {
        return null;
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
