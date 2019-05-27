package common.datastructure.implementation;

import common.datastructure.Tuple;
import common.type.CharNType;
import common.type.Type;
import error.MiniSqlRuntimeException;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class DefaultTuple implements Tuple {
    private List<Object> data;

    public DefaultTuple(List<Object> data) {
        this.data = data;
    }

    @Override
    public Object getValue(int index) {
        return data.get(index);
    }

    @Override
    public void setValue(int index, Object value) {
        data.set(index, value);
    }

    @Override
    public byte[] toBytes(List<Type> types, int size) {
        var byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            int i = 0;
            for (var value: data) {
                if (value instanceof Integer) {
                    dataOutputStream.writeInt((int) value);
                } else if (value instanceof Double) {
                    dataOutputStream.writeDouble((double) value);
                } else if (value instanceof String) {
                    String str = (String) value;
                    int strLen = ((CharNType) types.get(i)).getLength();
                    dataOutputStream.writeChars(str);
                    //append enough 0
                    for (int j = 0; j < strLen - str.length(); ++j) {
                        dataOutputStream.writeChar('\u0000');
                    }
                }
                i += 1;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new MiniSqlRuntimeException();
        }
    }
}
