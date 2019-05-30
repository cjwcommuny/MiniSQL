package manager.index.bplustree;

import java.util.List;

public interface Node {
    void printSubTree(String prefix, boolean isTail);
    boolean isRoot();
    Node getParent();
    boolean isLeaf();

    //the return node should be the node with larger keys
    Node split();

    Object getSmallestKey();
    void setParent(Node root);
    int keysCount();

    void setKeys(List<Object> keys);

    Node getPreviousSibling();
    Node getFollowSibling();

    //NonLeafNode: childrenCount; LeafNode: recordsCount;
    int getRank();
    void merge(Node sibling);
    void deleteKeyAndCorrespondingPointer(Object key);
    Object getKey(int i);
    int childrenCount();

    void borrowChildrenFrom(Node node);
    void setKey(int i, Object key);
    String printKeys();
}
