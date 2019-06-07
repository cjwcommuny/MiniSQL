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

    private Map<String, Pair<MappedByteBuffer, FileChannel>> recordFilesMap = new HashMap<>();

    private static final String RANDOM_ACCESS_FILE_MODE = "rw";
    private static final int BYTE_BUFFER_SIZE = Integer.MAX_VALUE;
//    private static final int BLOCK_SIZE = 4096;
//    private static final long FILE_EXTEND_SIZE = BLOCK_SIZE;
//    private static final long INIT_LENGTH_OF_FILE = BLOCK_SIZE;

    @Getter
    private static FileHandler instance = new DefaultBufferManager();

//    private Map<String, Index> indexesMap
    private DefaultBufferManager() {}

    @Override
    public List<Info> quit() {
        writeAllTablesToDisk();
        return new LinkedList<>();
    }

    private void writeAllTablesToDisk() {
        try {
            for (var entry: recordFilesMap.entrySet()) {
                var byteBuffer = entry.getValue().getValue1();
                byteBuffer.force();
                var channel = entry.getValue().getValue2();
                channel.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
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

    @Override
    public void writeTupleToFile(byte[] bytes, String tableName, int offset) {
        var byteBuffer = recordFilesMap.get(tableName).getValue1();
        if (offset + bytes.length > byteBuffer.capacity()) {
            System.err.println("buffer overflow");
            throw new MiniSqlRuntimeException();
        }
        byteBuffer.position(offset);
        byteBuffer.put(bytes);
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

    @Override
    public ByteCarrier readTupleBytes(String tableName, int offset, int length) {
        var byteBuffer = recordFilesMap.get(tableName).getValue1();
        return new ByteCarrierImpl(byteBuffer);
    }

    @Override
    public void createTable(String tableName) {
        File recordFile = diskFileManager.createRecordFile(tableName);
        try {
            var randomRecordFile = new RandomAccessFile(recordFile, RANDOM_ACCESS_FILE_MODE);
            var fileChannel = randomRecordFile.getChannel();
            var byteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, BYTE_BUFFER_SIZE);
            recordFilesMap.put(tableName, new Pair<>(byteBuffer, fileChannel));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

    @Override
    public void init() {
        try {
            for (var pair: diskFileManager.getAllRecordFiles()) {
                String tableName = pair.getValue2();
                File file = pair.getValue1();
                var randomAccessFile = new RandomAccessFile(file, RANDOM_ACCESS_FILE_MODE);
                var fileChannel = randomAccessFile.getChannel();
                var byteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, BYTE_BUFFER_SIZE);
                recordFilesMap.put(tableName, new Pair<>(byteBuffer, fileChannel));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }

    @Override
    public List<Info> deleteTable(String tableName) {
        //if table not exist, do nothing
        List<Info> infos = new LinkedList<>();
        var pair = recordFilesMap.get(tableName);
        if (pair == null) {
            return infos;
        }
        var mappedByteBuffer = pair.getValue1();
        var channel = pair.getValue2();
        mappedByteBuffer.force();
        try {
            channel.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
        diskFileManager.deleteTableFile(tableName);
        return infos;
    }
}
