package manager.index.bplustree;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class NonLeafNode implements Node {
    private List<Node> children = new ArrayList<>();

    @Setter
    private List<Object> keys = new ArrayList<>();

    @Getter @Setter
    private Node parent;

    private void setChildren(List<Node> children) {
        for (Node node: children) {
            node.setParent(this);
        }
        this.children = children;
    }

    @Override
    public boolean isRoot() {
        return parent == null;
    }

    NonLeafNode(Node parent) {
        this.parent = parent;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    Node getSmallestLargerNode(Object key) {
        return children.get(getChildIndex(key));
    }

    private int getChildIndex(Object key) {
        return searchSmallestLargerKeyIndex(key);
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

    @Override
    public void printSubTree(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + printKeys());
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).printSubTree(prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1)
                    .printSubTree(prefix + (isTail ?"    " : "│   "), true);
        }
    }

    private String printKeys() {
        return keys.toString();
    }

    @Override
    public Node split() {
        var node = new NonLeafNode(null);
        List<Object> keysSplit = new ArrayList<>();
        List<Node> childrenSplit = new ArrayList<>();
        for (int i = keys.size() / 2 + 1; i < keys.size(); ++i) {
            keysSplit.add(keys.get(i));
            childrenSplit.add(children.get(i));
        }
        childrenSplit.add(children.get(children.size() - 1));
        children.subList(children.size() / 2, children.size()).clear();
        keys.subList(keys.size() / 2, keys.size()).clear();
        node.setChildren(childrenSplit);
        node.setKeys(keysSplit);
        return node;
    }

    void addChild(Node child) {
        children.add(child);
        child.setParent(this);
    }

    void addKey(Object key) {
        keys.add(key);
    }

    @Override
    public Object getSmallestKey() {
        return keys.get(0);
    }

    @Override
    public int getKeysCount() {
        return keys.size();
    }

    int getChildrenCount() {
        return children.size();
    }

    void insertKeyAndNode(Object key, Node nodeSplit) {
        int insertIndex = searchSmallestLargerKeyIndex(key);
        keys.add(insertIndex, key);
        children.add(insertIndex + 1, nodeSplit);
        nodeSplit.setParent(this);
    }
}
