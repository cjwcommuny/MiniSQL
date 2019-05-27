package manager.index.bplustree;

public interface Node {
    boolean isLeaf();
    Node getChildNode(Object key);
}
