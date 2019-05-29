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
    int getKeysCount();

    void setKeys(List<Object> keys);
}
