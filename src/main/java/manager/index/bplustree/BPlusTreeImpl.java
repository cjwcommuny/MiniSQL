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
        if (leaf.keysCount() > rank) {
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
        if (parent.childrenCount() > rank) {
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
        var leaf = findLeafNode(key);
        deleteEntry(leaf, key);
    }

    private void deleteEntry(Node node, Object key) {
        node.deleteKeyAndCorrespondingPointer(key);
        if (node.isRoot() && node.childrenCount() == 1) {
            setRoot(((NonLeafNode) node).getChild(0));
        } else {
            boolean needRearrange = node.getRank() < getMinimumRank();
            if (needRearrange) {
                //merge with the sibling
                Node leftNode;
                Node rightNode;
                var previousNode = node.getPreviousSibling();
                var followingNode = node.getFollowSibling();
                boolean usePrevious;
                if (previousNode == null || previousNode.getRank() > followingNode.getRank()) {
                    leftNode = node;
                    rightNode = followingNode;
                    usePrevious = false;
                } else {
                    leftNode = previousNode;
                    rightNode = node;
                    usePrevious = true;
                }

                boolean singleNodeCanContainAllChildren = leftNode.getRank() + rightNode.getRank() <= rank;
                if (singleNodeCanContainAllChildren) {
                    //merge them
                    leftNode.merge(rightNode);
                    deleteEntry(node.getParent(), rightNode.getSmallestKey());
                } else {
                    //borrow child from sibling
                    if (usePrevious) {
                        rightNode.borrowChildrenFrom(leftNode);
                    } else {
                        leftNode.borrowChildrenFrom(rightNode);
                    }
                }
            }
        }
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

    private int getMinimumRank() {
        return (rank - 1) / 2 + 1;
    }

    private void setRoot(Node node) {
        root = node;
        root.setParent(null);
    }

    static int compareKeys(Object key1, Object key2) {
        return ((Comparable) key1).compareTo(key2);
    }
}
