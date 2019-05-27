package common.datastructure.implementation;

import common.datastructure.*;
import common.type.Type;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.naming.OperationNotSupportedException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.*;


class DefaultTable implements Table  {
    @Getter
    private Catalog catalog;
    private List<Tuple> data = new LinkedList<>();

    @Getter
    private List<Type> types;

    @Getter
    private Map<String, Index> indexesMap = new HashMap<>();

    @Getter
    private int tupleSize;

    @Override
    public void putIndex(Index index) {
        indexesMap.put(index.getColumnName(), index);
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
    public int getOffset() {
        return getCurrentIndex() * getTupleSize();
    }

    private int getCurrentIndex() {
        return data.size();
    }

    @Override
    public int getColumnsCount() {
        return getColumns().size();
    }

    @Override
    public void deleteTuple(List<Condition> conditions) {
        throw new UnsupportedOperationException();
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

}
