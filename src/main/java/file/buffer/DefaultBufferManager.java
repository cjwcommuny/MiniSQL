package file.buffer;

import common.datastructure.Index;
import common.info.Info;
import lombok.Getter;
import manager.FileHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DefaultBufferManager implements FileHandler {
    @Getter
    private static FileHandler instance = new DefaultBufferManager();

//    private Map<String, Index> indexesMap

    @Override
    public List<Info> quit() {
        //TODO: write all buffer to disk
        return new LinkedList<>();
    }

    @Override
    public void writeTableCatalogToFile(byte[] bytes, String tableName, int offset) {

    }

    @Override
    public void writeIndexToFile(byte[] bytes, String indexName, String tableName) {

    }

    @Override
    public void writeTupleToFile(byte[] bytes, String tableName, int offset) {

    }

    @Override
    public byte[] readTableCatalog(String tableName) {
        return new byte[0];
    }

    @Override
    public byte[] readIndex(String indexName) {
        return new byte[0];
    }

    @Override
    public byte[] readTuples(String tableName) {
        return new byte[0];
    }
}
