package manager.index.bplustree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonLeafNode implements Node {
    private Node[] children;
    private Object[] keys;
    private int keyCount;

    public NonLeafNode(int N) {
        children = new Node[N];
        keys = new Object[N - 1];
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    public Node getSmallestLargerNode(Object key) {
        return children[getChildIndex(key)];
    }

//    public Node getLargestSmallerNode(Object key) {
//        int index = getChildIndex(key);
//        if (keys[index].equals(key)) {
//            //equal
//            return children[index];
//        } else if (index == 0) {
//            //not exist
//            return null;
//        } else {
//            return children[index - 1];
//        }
//    }

    private int getChildIndex(Object key) {
        return searchSmallestLargerKeyIndex(key);
    }

    private int searchSmallestLargerKeyIndex(Object key) {
        return Arrays.binarySearch(keys, 0, keyCount, key);
    }
}
