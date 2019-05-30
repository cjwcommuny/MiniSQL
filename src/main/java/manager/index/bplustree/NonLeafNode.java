package manager.index.bplustree;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

import static manager.index.bplustree.BPlusTreeImpl.compareKeys;

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
                BPlusTreeImpl::compareKeys
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
    public int keysCount() {
        return keys.size();
    }

    public int childrenCount() {
        return children.size();
    }

    void insertKeyAndNode(Object key, Node nodeSplit) {
        int insertIndex = searchSmallestLargerKeyIndex(key);
        keys.add(insertIndex, key);
        children.add(insertIndex + 1, nodeSplit);
        nodeSplit.setParent(this);
    }

    @Override
    public Node getPreviousSibling() {
        return ((NonLeafNode) parent).getPreviousSiblingOf(this);
    }

    Node getPreviousSiblingOf(Node node) {
        int index = children.indexOf(node);
        if (index == 0) {
            return null;
        } else {
            return children.get(index - 1);
        }
    }

    @Override
    public Node getFollowSibling() {
        return ((NonLeafNode) parent).getFollowSiblingOf(this);
    }

    Node getFollowSiblingOf(Node node) {
        int index = children.indexOf(node);
        if (index == children.size() - 1) {
            return null;
        } else {
            return children.get(index + 1);
        }
    }

    @Override
    public void merge(Node sibling) {
        var nonLeafSibling = (NonLeafNode) sibling;
        this.children.addAll(nonLeafSibling.children);
        this.keys.addAll(nonLeafSibling.children);
    }

    @Override
    public int getRank() {
        return childrenCount();
    }

    void removeChild(Node child) {
        children.remove(child);
    }

    void removeKey(Object key) {
        keys.remove(key);
    }

    @Override
    public Object getKey(int i) {
        return keys.get(i);
    }

    @Override
    public void deleteKeyAndCorrespondingPointer(Object key) {
        int index = keys.indexOf(key);
        keys.remove(key);
        children.remove(index + 1);
    }

    Node getChild(int i) {
        return children.get(i);
    }

    @Override
    public void borrowChildrenFrom(Node node) {
        var nonLeafNode = (NonLeafNode) node;
        int childrenRemained = (this.childrenCount() + node.childrenCount()) / 2;
        if (compareKeys(this.getSmallestKey(), node.getSmallestKey()) < 0) {
            borrowChildrenFromFollow(nonLeafNode, childrenRemained);
        } else {
            borrowChildrenFromPrevious(nonLeafNode, childrenRemained);
        }
    }

    private void borrowChildrenFromPrevious(NonLeafNode nonLeafNode, int childrenRemained) {
        var childrenBorrowed = nonLeafNode.children.subList(nonLeafNode.childrenCount() - childrenRemained, nonLeafNode.childrenCount());
        childrenBorrowed.forEach(node -> node.setParent(this));
        this.children.addAll(0, childrenBorrowed);
        childrenBorrowed.clear();

        var keysBorrowed = nonLeafNode.keys.subList(nonLeafNode.childrenCount() - childrenRemained, nonLeafNode.childrenCount());
        this.keys.addAll(0, keysBorrowed);
        keysBorrowed.clear();
        nonLeafNode.keys.remove(nonLeafNode.keysCount());
    }

    private void borrowChildrenFromFollow(NonLeafNode nonLeafNode, int childrenRemained) {
        var childrenBorrowed = nonLeafNode.children.subList(0, nonLeafNode.childrenCount() - childrenRemained);
        childrenBorrowed.forEach(node -> node.setParent(this));
        this.children.addAll(childrenBorrowed);
        childrenBorrowed.clear();

        var keysBorrowed = nonLeafNode.keys.subList(0, nonLeafNode.childrenCount() - childrenRemained - 1);
        this.keys.addAll(keysBorrowed);
        keysBorrowed.clear();
        nonLeafNode.keys.remove(0);
    }
}
