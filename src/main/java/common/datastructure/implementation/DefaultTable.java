package common.datastructure.implementation;

import common.datastructure.*;
import common.type.CharNType;
import common.type.FloatType;
import common.type.IntType;
import common.type.Type;
import error.MiniSqlRuntimeException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import manager.FileHandler;
import middlelayer.RecordManager;

import javax.naming.OperationNotSupportedException;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;


class DefaultTable implements Table {
    private static TupleFactory tupleFactory = new TupleFactory();
    private static IndexFactory indexFactory = new IndexFactory();
    @Getter
    private Catalog catalog;
    @Getter
    private int tuplesCount = 0;

    @Getter
    private List<Type> types;

    // columnName -> index
    @Getter
    private Map<String, Index> indexesMap = new HashMap<>();

    //index name -> index
    private Map<String, Index> indexesNameMap = new HashMap<>();

    //store index (not offset)
    @Getter
    private Queue<Integer> freeTuplePositions = new LinkedList<>();

    @Getter
    private int tupleSize;
    @Getter
    private int lastTuplePosition = 0;

    @Override
    public void putIndex(Index index) {
        indexesMap.put(index.getColumnName(), index);
        indexesNameMap.put(index.getIndexName(), index);
    }

    @Override
    public boolean existColumn(String columnName) {
        for (var column: getColumns()) {
            if (column.getColumnName().equals(columnName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getColumnIndex(String columnName) {
        int i = 0;
        for (var column: getColumns()) {
            if (column.getColumnName().equals(columnName)) {
                return i;
            }
            i += 1;
        }
        return -1;
    }

    DefaultTable(String tableName, List<Column> columns, Column primaryKey) {
        this.catalog = new DefaultCatalog(tableName, columns, primaryKey);
        generateTypesBuffer();
        initFreeTuplePositions();
    }

    private void initFreeTuplePositions() {
    }

    private void generateTypesBuffer() {
        types = new ArrayList<>();
        for (var column: getColumns()) {
            Type type = column.getType();
            types.add(type);
            tupleSize += type.getSize();
        }
    }

    @Override
    public int getColumnsCount() {
        return getColumns().size();
    }

    @Override
    public void deleteTuple(int i) {
        tuplesCount -= 1;
        if (i == lastTuplePosition - 1) {
            lastTuplePosition -= 1;
        } else {
            freeTuplePositions.add(i);
        }
    }

    @Override
    public String getTableName() {
        return catalog.getTableName();
    }

    @Override
    public List<Column> getColumns() {
        return catalog.getColumns();
    }

    @Override
    public Column getPrimaryKey() {
        return catalog.getPrimaryKey();
    }

    @Override
    public int addTuple() {
        tuplesCount += 1;
        if (freeTuplePositions.size() == 0) {
            return lastTuplePosition++;
        } else {
            return freeTuplePositions.remove();
        }
    }

    @Override
    public Index getIndex(String columnName) {
        return indexesMap.get(columnName);
    }

    @Override
    public String getColumnName(int i) {
        return catalog.getColumns().get(i).getColumnName();
    }

    @Override
    public Index getPrimaryIndex() {
        return indexesNameMap.get(indexFactory.generatePrimaryKeyIndexName(getTableName()));
    }

    @Override
    public boolean existIndex(String indexName) {
        return indexesNameMap.containsKey(indexName);
    }

    @Override
    public Column getColumn(String columnName) {
        return getColumns().get(getColumnIndex(columnName));
    }

    @Override
    public void deleteIndex(String indexName) {
        Index index = indexesNameMap.get(indexName);
        indexesMap.remove(index.getColumnName());
        indexesNameMap.remove(indexName);
    }

    @Override
    public void addIndex(Index index, String columnName, String indexName) {
        indexesMap.put(columnName, index);
        indexesNameMap.put(indexName, index);
    }

    private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
        catalog = (Catalog) inputStream.readObject();
        tuplesCount = inputStream.readInt();

        int typesCount = inputStream.readInt();
        types = new ArrayList<>(typesCount);
        for (int i = 0; i < typesCount; ++i) {
            types.add((Type) inputStream.readObject());
        }

        int mapSize = inputStream.readInt();
        indexesMap = new HashMap<>();
        indexesNameMap = new HashMap<>();
        for (int i = 0; i < mapSize; ++i) {
            String indexName = inputStream.readUTF();
            String columnName = inputStream.readUTF();
            Index index = (Index) inputStream.readObject();
            indexesMap.put(columnName, index);
            indexesNameMap.put(indexName, index);
        }

        int freeTuplePositionsSize = inputStream.readInt();
        freeTuplePositions = new LinkedList<>();
        for (int i = 0; i < freeTuplePositionsSize; ++i) {
            freeTuplePositions.add(inputStream.readInt());
        }

        lastTuplePosition = inputStream.readInt();

        //operation in constructor
        generateTypesBuffer();
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeObject(catalog);
        outputStream.writeInt(tuplesCount);

        outputStream.writeInt(types.size());
        for (int i = 0; i < types.size(); ++i) {
            outputStream.writeObject(types.get(i));
        }

        //write two index maps
        var reverseMap = generateReverseMap();
        outputStream.writeInt(reverseMap.size());
        for (var entry: reverseMap.entrySet()) {
            Index index = entry.getKey();
            String columnName = entry.getValue().getValue1();
            String indexName = entry.getValue().getValue2();
            outputStream.writeUTF(indexName);
            outputStream.writeUTF(columnName);
            outputStream.writeObject(index);
        }

        outputStream.writeInt(freeTuplePositions.size());
        for (int position: freeTuplePositions) {
            outputStream.writeInt(position);
        }

        outputStream.writeInt(lastTuplePosition);
    }

    private Map<Index, Pair<String, String>> generateReverseMap() {
        //index -> (columnName, indexName)
        Map<Index, Pair<String, String>> reverseMap = new HashMap<>();
        for (var entry: indexesMap.entrySet()) {
            String columnName = entry.getKey();
            Index index = entry.getValue();
            var pair = new Pair<String, String>(columnName, null);
            reverseMap.put(index, pair);
        }
        for (var entry: indexesNameMap.entrySet()) {
            String indexName = entry.getKey();
            Index index= entry.getValue();
            var pair = reverseMap.get(index);
            pair.setValue2(indexName);
        }
        return reverseMap;
    }

    @Override
    public List<Tuple> getAllTuplesAndOffsets(FileHandler fileHandler,
                                              List<Integer> OUT_offsets,
                                              RecordManager recordManager) {
        int index = 0;
        Set<Integer> freePositionsSet = new HashSet<>(freeTuplePositions);
        int offset = 0;
        List<Tuple> tuples = new LinkedList<>();
        while (index < getTuplesCount()) {
            if (!freePositionsSet.contains(index)) {
                tuples.add(recordManager.bytesToTuple(getTableName(), getTypes(), offset));
                OUT_offsets.add(offset);
                index += 1;
            }
            offset += getTupleSize();
        }
        return tuples;
    }
}
/*
* table serialization format:
*
* catalog: Catalog (default)
* tuplesCount: int
*
* typesCount: int
* (type: Type)*
*
* //first build a reverse-map to avoid circular reference
* indexCount: int
* (indexName: String, columnName: String, index: Index)*
*
* freeTuplePositionsCount: int
* (position: int)*
*
* lastTuplePosition: int
*
*
* other operation:
* generateTypesBuffer(): generate types, tupleSize
* */