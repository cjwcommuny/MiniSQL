package manager.index;

import common.datastructure.Index;
import common.datastructure.Table;
import common.datastructure.Tuple;
import file.buffer.DefaultBufferManager;
import lombok.Getter;
import manager.FileHandler;
import middlelayer.IndexManager;

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
        writeIndex();
    }

    private void writeIndex() {
        //TODO
        throw new UnsupportedOperationException();
    }
}
