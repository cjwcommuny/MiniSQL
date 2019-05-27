package file.buffer;

import common.datastructure.Tuple;
import common.datastructure.implementation.TupleFactory;
import common.info.Info;
import common.type.CharNType;
import common.type.FloatType;
import common.type.IntType;
import common.type.Type;
import error.MiniSqlRuntimeException;
import file.diskfile.DefaultDiskFileManager;
import lombok.Getter;
import manager.FileHandler;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.List;

public class DefaultBufferManager implements FileHandler {
    private TupleFactory tupleFactory = new TupleFactory();
    private DiskFileManager diskFileManager = new DefaultDiskFileManager();

    private Map<String, RandomAccessFile> filesMap = new HashMap<>();
    private static final String RANDOM_ACCESS_FILE_MODE = "rw";

    @Getter
    private static FileHandler instance = new DefaultBufferManager();

//    private Map<String, Index> indexesMap

    @Override
    public List<Info> quit() {
        //TODO: write all buffer to disk
        writeAllTablesToDisk();
        throw new UnsupportedOperationException();
    }

    private void writeAllTablesToDisk() {
        try {
            for (var entry: filesMap.entrySet()) {
                var file = entry.getValue();
                file.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

    @Override
    public void writeTableCatalogToFile(byte[] bytes, String tableName, int offset) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void writeIndexToFile(byte[] bytes, String indexName, String tableName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void writeTupleToFile(byte[] bytes, String tableName, int offset) {
        var randomAccessFile = filesMap.get(tableName);
        if (randomAccessFile == null) {
            System.err.println("random access file not exists");
            throw new MiniSqlRuntimeException();
        }
        try {
            randomAccessFile.write(bytes, offset, bytes.length);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }

    }

    //TODO
    private Tuple getTuple(DataInputStream inputStream, List<Type> types) {
        List<Object> values = new ArrayList<>();
        try {
            for (Type type: types) {
                if (type instanceof IntType) {
                    values.add(inputStream.readInt());
                } else if (type instanceof FloatType) {
                    values.add(inputStream.readDouble());
                } else if (type instanceof CharNType) {
                    int length = ((CharNType) type).getLength();
                    final int CHAR_SIZE = 2;
                    final String PADDING = "\u0000";
                    values.add(new String(inputStream.readNBytes(length * CHAR_SIZE), StandardCharsets.UTF_16).replace(PADDING, ""));
                }
            }
            return tupleFactory.createTuple(values);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

    @Override
    public byte[] readTableCatalog(String tableName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] readIndex(String indexName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] readTuples(String tableName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createTable(String tableName) {
        File tableFile = diskFileManager.createTableFile(tableName);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(tableFile, RANDOM_ACCESS_FILE_MODE);
            filesMap.put(tableName, randomAccessFile);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

    @Override
    public long getTableTuplesTotalLength(String tableName) {
        var file = filesMap.get(tableName);
        if (file == null) {
            throw new MiniSqlRuntimeException();
        }
        try {
            return file.length();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }
}
