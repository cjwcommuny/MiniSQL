package manager.index.bplustree;

import common.datastructure.restriction.Range;

import java.io.Serializable;
import java.util.List;

public interface BPlusTree extends Serializable {
    Node getRoot();
    List<Integer> find(Object key);
    List<Integer> find(Range range, List<Object> notEqualValues);
    void insert(Object key, int index);
    void delete(Object key);
    void delete(Range range, List<Object> notEqualValues);
    void print();
    boolean exist(Object key);
}
