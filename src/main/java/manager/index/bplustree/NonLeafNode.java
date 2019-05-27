package manager.index.bplustree;

public class NonLeafNode implements Node {
    private Node[] children;
    private Object[] keys;

    public NonLeafNode(int N) {
        children = new Node[N];
        keys = new Object[N - 1];
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Node getChildNode(Object key) {
        return children[searchSmallestLargerKeyIndex(key)];
    }

    private int searchSmallestLargerKeyIndex(Object key) {
        //TODO: use binary search
        throw new UnsupportedOperationException();
    }
}
