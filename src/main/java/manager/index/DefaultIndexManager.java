package manager.index;

import common.datastructure.Index;
import common.datastructure.Table;
import common.datastructure.Tuple;
import common.datastructure.restriction.Restriction;
import file.buffer.DefaultBufferManager;
import lombok.Getter;
import manager.FileHandler;
import middlelayer.IndexManager;

import java.util.LinkedList;
import java.util.List;

public class DefaultIndexManager implements IndexManager {
    @Getter
    private static IndexManager instance = new DefaultIndexManager();

    private FileHandler fileHandler = DefaultBufferManager.getInstance();

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
                index.delete(tuple.getValue(columnIndex));
            }
        }
    }
}
