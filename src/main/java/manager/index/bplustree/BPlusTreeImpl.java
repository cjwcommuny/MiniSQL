package manager.index.bplustree;

import java.util.List;

public class BPlusTreeImpl implements BPlusTree {
    private Node root;

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public List<Integer> find(Object key) {
        Node currentNode = root;
        while (!(currentNode instanceof LeafNode)) {
            currentNode = ((NonLeafNode) currentNode).getSmallestLargerNode(key);
        }
        //currentNode instanceof LeafNode
        return ((LeafNode) currentNode).getIndexes(key);
    }

    @Override
    public void insert(Object key, int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException();
    }
}
