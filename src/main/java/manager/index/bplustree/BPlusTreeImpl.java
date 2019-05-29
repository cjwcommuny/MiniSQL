package manager.index.bplustree;

import lombok.Setter;

import java.util.List;

public class BPlusTreeImpl implements BPlusTree {
    @Setter
    private Node root;
    private int rank;
    private Class keyClass;

    public BPlusTreeImpl(int rank, Class keyClass) {
        this.rank = rank;
        this.keyClass = keyClass;
    }

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public List<Integer> find(Object key) {
        Node currentNode = findLeafNode(key);
        //currentNode instanceof LeafNode
        return ((LeafNode) currentNode).getIndexes(key);
    }

    private LeafNode findLeafNode(Object key) {
        Node currentNode = root;
        while (!(currentNode instanceof LeafNode)) {
            currentNode = ((NonLeafNode) currentNode).getSmallestLargerNode(key);
        }
        return (LeafNode) currentNode;
    }

    @Override
    public void insert(Object key, int index) {
        if (root == null) {
            //empty tree
            var newRoot = new LeafNode(null);
            newRoot.insertKeyAndRecord(key, index);
            root = newRoot;
            return;
        }
        var leaf = findLeafNode(key);
        insertInLeaf(leaf, key, index);
        if (leaf.getKeysCount() > rank) {
            splitLeafNode(leaf);
        }
    }

    private void splitLeafNode(LeafNode leaf) {
        Node leafSplit = leaf.split();
        insertInParent(leaf, leafSplit);
    }

    private void insertInParent(Node originalNode, Node nodeSplit) {
        if (originalNode.isRoot()) {
            //directly create a new root and insert originalNode and nodeSplit to it
            var newRoot = new NonLeafNode(null);
            this.root = newRoot;
            newRoot.addChild(originalNode);
            newRoot.addChild(nodeSplit);
            newRoot.addKey(nodeSplit.getSmallestKey());
            return;
        }
        var parent = (NonLeafNode) originalNode.getParent();
        parent.insertKeyAndNode(nodeSplit.getSmallestKey(), nodeSplit);
        if (parent.getChildrenCount() > rank) {
            //split parent
            var nodeNewSplit = parent.split();
            insertInParent(parent, nodeNewSplit);
        }
    }

    private void insertInLeaf(LeafNode leaf, Object key, int index) {
        leaf.insertKeyAndRecord(key, index);
    }

    @Override
    public void delete(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        if (root != null) {
            root.printSubTree("", true);
        }
    }

    public static void main(String[] args) {

    }

    private static void testInsert() {
        BPlusTree tree  = new BPlusTreeImpl(3, Integer.class);
        tree.insert(8, 8);
        tree.insert(11, 11);
        tree.insert(12, 12);
        tree.insert(16, 16);
        tree.insert(17, 17);
        tree.insert(22, 22);
        tree.insert(23, 23);
        tree.insert(31, 31);
        tree.insert(41, 41);
        tree.insert(52, 52);
        tree.insert(58, 59);
        tree.insert(61, 61);
        tree.print();
    }

//    private static BPlusTree constructTree() {
//        var root = new NonLeafNode();
//        root.getKeys().add("hello1");
//        root.getKeys().add("789979");
//        var leaf1 = new LeafNode();
//        var leaf2 = new LeafNode();
//        root.getChildren().add(leaf1);
//        root.getChildren().add(leaf2);
//        leaf1.getRecords().add(new LinkedList<>(Arrays.asList(1,2,3)));
//
//    }



}
