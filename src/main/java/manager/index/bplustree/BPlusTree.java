package manager.index.bplustree;

import common.datastructure.restriction.Range;

import java.util.List;

public interface BPlusTree {
    Node getRoot();
    List<Integer> find(Object key);
    List<Integer> find(Range range, List<Object> notEqualValues);
    void insert(Object key, int index);
    void delete(Object key);
    void delete(Range range, List<Object> notEqualValues);
    void print();
}
