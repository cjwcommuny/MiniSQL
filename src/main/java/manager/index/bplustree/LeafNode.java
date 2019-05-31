package manager.index.bplustree;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

import static manager.index.bplustree.BPlusTreeImpl.compareKeys;

class LeafNode implements Node {
    //in LeafNode, size of records and keys are the same
    @Setter @Getter(AccessLevel.PRIVATE)
    private List<List<Integer>> records = new ArrayList<>();

    @Setter @Getter(AccessLevel.PRIVATE)
    private List<Object> keys = new ArrayList<>();

    @Getter @Setter
    private Node parent;

    @Override
    public boolean isRoot() {
        return parent == null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void printSubTree(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + printSelf());
        for (int i = 0; i < records.size() - 1; i++) {
            System.out.println(prefix + (isTail ? "    " : "│   ") + "├── " + records.get(i));
        }
        if (records.size() > 0) {
            System.out.println(prefix + (isTail ?"    " : "│   ") + "└── " + records.get(records.size() - 1));
        }
    }

    public String printSelf() {
        return printKeys() + ", parent: " + ((parent == null) ? "" : parent.printKeys());
    }

    @Override
    public String printKeys() {
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
                BPlusTreeImpl::compareKeys
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

    public int keysCount() {
        return keys.size();
    }

    void insertKeyAndRecord(Object key, List<Integer> record) {
        records.add(record);
        keys.add(key);
    }

    void insertKeyAndRecord(Object key, int record) {
        int i = Collections.binarySearch(keys, key,
                BPlusTreeImpl::compareKeys
        );
        if (i < 0) {
            //not found
            var list = new LinkedList<Integer>();
            list.add(record);
            int insertIndex = -i - 1;
            records.add(insertIndex, list);
            keys.add(insertIndex, key);
        } else {
            //found and update
            records.get(i).add(record);
        }
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

    @Override
    public void deleteKeyAndCorrespondingPointer(Object key) {
        int index = keys.indexOf(key);
        keys.remove(key);
        records.remove(index);
    }

    int recordsCount() {
        return records.size();
    }

    @Override
    public Node getPreviousSibling() {
        return ((NonLeafNode) parent).getPreviousSiblingOf(this);
    }

    @Override
    public Node getFollowSibling() {
        return ((NonLeafNode) parent).getFollowSiblingOf(this);
    }

    @Override
    public int getRank() {
        return keysCount();
    }

    @Override
    public void merge(Node sibling) {
        //thisNode is previous to sibling node
        LeafNode siblingLeaf = (LeafNode) sibling;
        records.addAll(siblingLeaf.getRecords());
        keys.addAll(siblingLeaf.getKeys());
    }

    private List<Integer> getRecord(int i) {
        return records.get(i);
    }

    @Override
    public Object getKey(int i) {
        return keys.get(i);
    }

    @Override
    public int childrenCount() {
        //leaf node has no children
        return 0;
    }

    @Override
    public void borrowChildrenFrom(Node node) {
        LeafNode leafNode = (LeafNode) node;
        int recordsRemained = (this.recordsCount() + leafNode.recordsCount()) / 2;
        if (compareKeys(this.getSmallestKey(), node.getSmallestKey()) < 0) {
            borrowChildrenFromFollow(leafNode, recordsRemained);
        } else {
            borrowChildrenFromPrevious(leafNode, recordsRemained);
        }
    }

    private void borrowChildrenFromPrevious(LeafNode node, int recordsRemained) {
        var borrowRecords = node.getRecords().subList(recordsRemained, node.recordsCount());
        this.getRecords().addAll(0, borrowRecords);

        var borrowKeys = node.getKeys().subList(recordsRemained, node.keysCount());
        this.getKeys().addAll(0, borrowKeys);

        borrowRecords.clear();
        borrowKeys.clear();
    }

    private void borrowChildrenFromFollow(LeafNode node, int recordsRemained) {
        var borrowRecords = node.getRecords().subList(0, node.recordsCount() - recordsRemained);
        this.getRecords().addAll(borrowRecords);

        var borrowKeys = node.getKeys().subList(0, node.recordsCount() - recordsRemained);
        this.getKeys().addAll(borrowKeys);

        borrowRecords.clear();
        borrowKeys.clear();
    }

    @Override
    public void setKey(int i, Object key) {
        keys.set(i, key);
    }
}
