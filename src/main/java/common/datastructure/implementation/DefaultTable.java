package common.datastructure.implementation;

import common.datastructure.*;
import common.type.Type;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

@Getter
class DefaultTable implements Table  {
    private String tableName;
    private List<Column> columns;
    private Column primaryKey;
    private List<Tuple> data = new LinkedList<>();

    @Getter
    private List<Type> types;

    @Setter
    private Index index;

    @Override
    public boolean existColumn(String columnName) {
        for (var column: columns) {
            if (column.getColumnName().equals(columnName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getColumnIndex(String columnName) {
        int i = 0;
        for (var column: columns) {
            if (column.getColumnName().equals(columnName)) {
                return i;
            }
            i += 1;
        }
        return -1;
    }

    DefaultTable(String tableName, List<Column> columns, Column primaryKey) {
        this.tableName = tableName;
        this.columns = columns;
        this.primaryKey = primaryKey;
        generateTypesBuffer();
    }

    private void generateTypesBuffer() {
        types = new LinkedList<>();
        for (var column: columns) {
            types.add(column.getType());
        }
    }

    @Override
    public int getColumnsCount() {
        return columns.size();
    }

    @Override
    public void putTuple(Tuple tuple) {
        data.add(tuple);
    }

    @Override
    public void deleteTuple(List<Condition> conditions) {
        throw new UnsupportedOperationException();
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        // default serialization
        oos.defaultWriteObject();
        //TODO
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        // default deserialization
        ois.defaultReadObject();
        //TODO
    }
}
