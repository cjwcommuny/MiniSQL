package common.implementation;

import common.Tuple;

import java.util.List;

public class DefaultTuple implements Tuple {
    private List<Object> data;

    @Override
    public Object getValue(int index) {
        return data.get(index);
    }

    @Override
    public void setValue(int index, Object value) {
        data.set(index, value);
    }
}
