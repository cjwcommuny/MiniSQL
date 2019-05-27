package common.datastructure.implementation;

import common.datastructure.Condition;
import common.datastructure.Index;

import java.util.List;

public class DefaultIndex implements Index {
    //TODO
    @Override
    public List<Integer> getTupleIndex(List<Condition> conditions) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getIndexName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getColumnName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(Object key, int offset) {
        throw new UnsupportedOperationException();
    }
}
