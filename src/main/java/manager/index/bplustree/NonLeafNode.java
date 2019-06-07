package manager.index.bplustree;

import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.codegen.model.LeftRecursiveRuleFunction;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        int index = getChildIndex(key);
        if (index < keys.size() && compareKeys(keys.get(index), key) == 0) {
            return children.get(index + 1); //equal key
        } else {
            return children.get(index);
        }
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
        System.out.println(prefix + (isTail ? "└── " : "├── ") + printSelf());
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).printSubTree(prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1)
                    .printSubTree(prefix + (isTail ?"    " : "│   "), true);
        }
    }

    private String printSelf() {
        return printKeys() + ", parent: " + ((parent == null) ? "" : parent.printKeys());
    }

    @Override
    public String printKeys() {
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
        return getChild(0).getSmallestKey();
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
        this.addChildren(nonLeafSibling.children);
        this.keys.add(sibling.getSmallestKey()); //TODO: needed
        this.keys.addAll(nonLeafSibling.keys);
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
        int index = searchSmallestLargerKeyIndex(key);
        if (!(index >= keysCount()) && compareKeys(keys.get(index), key) == 0) {
            children.remove(index + 1);
            keys.remove(index);
        } else {
            children.remove(index);
            if (index == 0) {
                keys.remove(index);
            } else {
                keys.remove(index - 1);
            }
        }
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
        //TODO: buggy
        this.keys.add(0, this.getChild(0).getSmallestKey());

        var childrenBorrowed = nonLeafNode.children.subList(childrenRemained, nonLeafNode.childrenCount());
        childrenBorrowed.forEach(node -> node.setParent(this));
        this.children.addAll(0, childrenBorrowed);

        var keysBorrowed = nonLeafNode.keys.subList(childrenRemained, nonLeafNode.keysCount());

        this.keys.addAll(0, keysBorrowed);

        childrenBorrowed.clear();
        keysBorrowed.clear();
        nonLeafNode.keys.remove(nonLeafNode.keysCount() - 1);
    }

    private void borrowChildrenFromFollow(NonLeafNode nonLeafNode, int childrenRemained) {
        this.keys.add(nonLeafNode.getSmallestKey());

        var childrenBorrowed = nonLeafNode.children.subList(0, nonLeafNode.childrenCount() - childrenRemained);
        childrenBorrowed.forEach(node -> node.setParent(this));
        this.children.addAll(childrenBorrowed);


        var keysBorrowed = nonLeafNode.keys.subList(0, nonLeafNode.childrenCount() - childrenRemained - 1);
        this.keys.addAll(keysBorrowed);

        childrenBorrowed.clear();
        keysBorrowed.clear();
        nonLeafNode.keys.remove(0);
    }

    @Override
    public void setKey(int i, Object key) {
        keys.set(i, key);
    }

    public boolean isFirstChild(Node node) {
        int i = children.indexOf(node);
        return i == 0;
    }

    void updateKey(Node node) {
        //for node i, update key i - 1, i must > 0
        int i = children.indexOf(node);
        assert i > 0;
        keys.set(i - 1, node.getSmallestKey());
    }

    void addChildren(List<Node> nodes) {
        children.addAll(nodes);
        nodes.forEach(node -> node.setParent(this));
    }

    private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
        int rank = inputStream.readInt();
        children = new ArrayList<>(rank);
        keys = new ArrayList<>(rank - 1);
        for (int i = 0; i < rank - 1; ++i) {
            keys.add(inputStream.readObject());
        }

        for (int i = 0; i < rank; ++i) {
            Node node = (Node) inputStream.readObject();
            node.setParent(this);
            children.add(node);
        }

        if (children.get(0) instanceof LeafNode) {
            //set siblings
            for (int i = 0; i < children.size(); ++i) {
                Node leftNode = (i == 0) ? null : children.get(i - 1);
                Node rightNode = (i == children.size() - 1) ? null : children.get(i + 1);
                LeafNode leaf = (LeafNode) children.get(i);
                leaf.setPreviousLeaf((LeafNode) leftNode);
                leaf.setNextLeaf((LeafNode) rightNode);
            }
        }

    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeInt(getRank());
        for (Object key: keys) {
            outputStream.writeObject(key);
        }

        for (Node node: children) {
            outputStream.writeObject(node);
        }
    }
}
/*
* serialization format
*
* rank: int
* (key: Object)*
*
* operation:
* set parent and children
* */