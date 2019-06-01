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
    private int tuplesCount = 0;

    @Getter
    private List<Type> types;

    // columnName -> index
    @Getter
    private Map<String, Index> indexesMap = new HashMap<>();

    //TODO: index name -> index
    private Map<String, Index> indexesNameMap = new HashMap<>();

    //store index (not offset)
    private Queue<Integer> freeTuplePositions = new LinkedList<>();

    @Getter
    private int tupleSize;
    @Getter //TODO
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
    public Tuple bytesToTuple(byte[] bytes, int base) {
        List<Object> data = new ArrayList<>();
        int offset = base;
        for (Type type: types) {
            int byteCount = type.getSize();
            byte[] subArr = Arrays.copyOfRange(bytes, offset, offset + byteCount);
            if (type instanceof IntType) {
                ByteBuffer byteBuffer = ByteBuffer.wrap(subArr);
                data.add(byteBuffer.getInt());
            } else if (type instanceof FloatType) {
                ByteBuffer byteBuffer = ByteBuffer.wrap(subArr);
                data.add(byteBuffer.getDouble());
            } else if (type instanceof CharNType) {
                data.add(new String(subArr, StandardCharsets.UTF_16).replace("\u0000", ""));
            }
            offset += byteCount;
        }
        return tupleFactory.createTuple(data);
    }

    @Override
    public Index getPrimaryIndex() {
        return indexesNameMap.get(indexFactory.generatePrimaryKeyIndexName(getTableName()));
    }
}
