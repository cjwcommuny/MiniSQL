package common.datastructure.implementation;

import common.datastructure.Index;
import common.datastructure.restriction.Restriction;
import manager.index.bplustree.BPlusTree;
import manager.index.bplustree.BPlusTreeImpl;

import java.util.List;

public class DefaultIndex implements Index {
    private BPlusTree tree = new BPlusTreeImpl(3);

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
        tree.insert(key, offset);
    }

    @Override
    public void delete(Object key, Restriction restriction) {

    }
}
