package file.buffer;

import common.datastructure.ByteCarrier;
import common.datastructure.Pair;
import common.datastructure.Table;
import common.datastructure.Tuple;
import common.datastructure.implementation.ByteCarrierImpl;
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

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.List;

public class DefaultBufferManager implements FileHandler {
    private static TupleFactory tupleFactory = new TupleFactory();
    private static DiskFileManager diskFileManager = new DefaultDiskFileManager();

//    private Map<String, RandomAccessFile> filesMap = new HashMap<>();
    private Map<String, MappedByteBuffer> recordFilesMap = new HashMap<>();
    private Map<String, RandomAccessFile> catalogFilesMap = new HashMap<>();

    private static final String RANDOM_ACCESS_FILE_MODE = "rw";
    private static final int BYTE_BUFFER_SIZE = Integer.MAX_VALUE;
    private static final int BLOCK_SIZE = 4096;
    private static final long FILE_EXTEND_SIZE = BLOCK_SIZE;
    private static final long INIT_LENGTH_OF_FILE = BLOCK_SIZE;

    @Getter
    private static FileHandler instance = new DefaultBufferManager();

//    private Map<String, Index> indexesMap
    private DefaultBufferManager() {}

    @Override
    public List<Info> quit() {
        //TODO: write all buffer to disk
        writeAllTablesToDisk();
        throw new UnsupportedOperationException();
    }

    private void writeAllTablesToDisk() {
        //TODO: close
        for (var entry: recordFilesMap.entrySet()) {
            entry.getValue().force();
        }
//        try {
//            for (var entry: filesMap.entrySet()) {
//                var file = entry.getValue();
//                file.close();
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//            throw new MiniSqlRuntimeException();
//        }
    }

    @Override
    public void writeTableCatalogToFile(Table table) {
        File tableFile = diskFileManager.createTableCatalogFile(table.getTableName());
        try {
            var fileOutputStream = new FileOutputStream(tableFile);
            var objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(table);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println("cannot serialize table catalog: " + table.getTableName());
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

//    @Override
//    public void writeIndexToFile(byte[] bytes, String indexName, String tableName) {
//        throw new UnsupportedOperationException();
//    }

    @Override
    public void writeTupleToFile(byte[] bytes, String tableName, int offset) {
        var byteBuffer = recordFilesMap.get(tableName);
        if (offset + bytes.length > byteBuffer.capacity()) {
            System.err.println("random access file not exists");
            throw new MiniSqlRuntimeException();
        }
        byteBuffer.put(bytes, offset, bytes.length);
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
    public Collection<Table> readAllTableCatalogsFromFiles() {
        List<Table> tables = new LinkedList<>();
        for (File file: diskFileManager.getAllTableFiles()) {
            tables.add(readTableCatalog(file));
        }
        return tables;
    }

    private Table readTableCatalog(File file) {
        try (var fileInputStream = new FileInputStream(file);
             var objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            return (Table) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialize table catalog error");
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }


//    @Override
//    public byte[] readIndex(String indexName) {
//        throw new UnsupportedOperationException();
//    }

//    @Override
//    public byte[] readTupleBytes(String tableName) {
//        var randomAccessFile = filesMap.get(tableName);
//        if (randomAccessFile == null) {
//            return new byte[0];
//        }
//        try {
//            byte[] bytes = new byte[(int) randomAccessFile.length()]; //TODO: may not read the whole file!!
//            randomAccessFile.seek(0);
//            randomAccessFile.read(bytes);
//            return bytes;
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//            throw new MiniSqlRuntimeException();
//        }
//    }

    @Override
    public ByteCarrier readTupleBytes(String tableName, int offset, int length) {
        var byteBuffer = recordFilesMap.get(tableName);
        return new ByteCarrierImpl(byteBuffer);
    }

    @Override
    public void createTable(String tableName) {
        File tableFile = diskFileManager.createTableCatalogFile(tableName);
        File recordFile = diskFileManager.createRecordFile(tableName);
        try {
            var randomTableFile = new RandomAccessFile(tableFile, RANDOM_ACCESS_FILE_MODE);
            catalogFilesMap.put(tableName, randomTableFile);

            var randomRecordFile = new RandomAccessFile(recordFile, RANDOM_ACCESS_FILE_MODE);
            var byteBuffer = randomRecordFile.getChannel()
                    .map(FileChannel.MapMode.READ_WRITE, 0, BYTE_BUFFER_SIZE);
            recordFilesMap.put(tableName, byteBuffer);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

//    @Override
//    public long getTableTuplesTotalLength(String tableName) {
//        var file = filesMap.get(tableName);
//        if (file == null) {
//            throw new MiniSqlRuntimeException();
//        }
//        try {
//            return file.length();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//            throw new MiniSqlRuntimeException();
//        }
//    }

    @Override
    public void init() {
        try {
            for (var pair: diskFileManager.getAllRecordFiles()) {
                String tableName = pair.getValue2();
                File file = pair.getValue1();
                catalogFilesMap.put(tableName, new RandomAccessFile(file, RANDOM_ACCESS_FILE_MODE));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }
}
