package manager.index.bplustree;

import java.util.List;

public interface BPlusTree {
    Node getRoot();
    List<Integer> find(Object key);
    void insert(Object key, int index);
    void delete(Object key);
}
