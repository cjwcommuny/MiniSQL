package manager.index.bplustree;

import java.util.Arrays;
import java.util.List;

public class LeafNode implements Node {
    private List<Integer>[] records;
    private Object[] keys;
    private int keyCount;

    @Override
    public boolean isLeaf() {
        return false;
    }

    public List<Integer> getIndexes(Object key) {
        int i = searchSmallestLargerKeyIndex(key);
        if (i > keyCount || !keys[i].equals(key)) {
            return null;
        } else {
            return records[i];
        }
    }

    private int searchSmallestLargerKeyIndex(Object key) {
        return Arrays.binarySearch(keys, 0, keyCount, key);
    }
}
