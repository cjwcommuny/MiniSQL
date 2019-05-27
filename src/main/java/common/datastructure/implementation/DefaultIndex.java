package common.datastructure.implementation;

import common.datastructure.Condition;
import common.datastructure.Index;
import common.datastructure.Restriction;

import java.util.List;

public class DefaultIndex implements Index {
    @Override
    public List<Integer> getTupleIndex(Restriction restriction) {
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

    @Override
    public void delete(Object key) {

    }
}
