package manager.index.bplustree;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

class LeafNode implements Node {
    //in LeafNode, size of records and keys are the same
    @Setter
    private List<List<Integer>> records = new ArrayList<>();

    @Setter
    private List<Object> keys = new ArrayList<>();

    @Getter @Setter
    private Node parent;

    @Override
    public boolean isRoot() {
        return parent == null;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public void printSubTree(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + printLeaf());
        for (int i = 0; i < records.size() - 1; i++) {
            System.out.println(prefix + (isTail ? "    " : "│   ") + "├── " + records.get(i));
        }
        if (records.size() > 0) {
            System.out.println(prefix + (isTail ?"    " : "│   ") + "└── " + records.get(records.size() - 1));
        }
    }

    private String printLeaf() {
        return keys.toString();
    }

    List<Integer> getIndexes(Object key) {
        int i = searchSmallestLargerKeyIndex(key);
        if (i > keys.size() || !keys.get(i).equals(key)) {
            return null;
        } else {
            return records.get(i);
        }
    }



    private int searchSmallestLargerKeyIndex(Object key) {
        int index = Collections.binarySearch(keys, key,
                (Object o1, Object o2) -> ((Comparable) o1).compareTo((Comparable) o2)
        );
        if (index < 0) {
            //not found
            return -index - 1;
        } else {
            return index;
        }
    }

    LeafNode(Node parent) {
        this.parent = parent;
    }

    public int getKeysCount() {
        return keys.size();
    }

    void insertKeyAndRecord(Object key, List<Integer> record) {
        records.add(record);
        keys.add(key);
    }

    void insertKeyAndRecord(Object key, int record) {
        var list = new LinkedList<Integer>();
        list.add(record);
        int insertIndex = searchSmallestLargerKeyIndex(key);
        records.add(insertIndex, list);
        keys.add(insertIndex, key);
    }

    @Override
    public Node split() {
        var nodeSplit = new LeafNode(null);
        List<Object> keysSplit = new ArrayList<>();
        var recordsSplit = new ArrayList<List<Integer>>();
        int left = keys.size() / 2;
        int right = keys.size();
        for (int i = left; i < right; ++i) {
            keysSplit.add(keys.get(i));
            recordsSplit.add(records.get(i));
        }
        keys.subList(left, right).clear();
        records.subList(left, right).clear();
        nodeSplit.setKeys(keysSplit);
        nodeSplit.setRecords(recordsSplit);
        return nodeSplit;
    }

    @Override
    public Object getSmallestKey() {
        return keys.get(0);
    }


}
