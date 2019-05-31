package manager.index.bplustree;

import common.datastructure.MaxValue;
import common.datastructure.MinValue;

import java.util.List;

public class BPlusTreeImpl implements BPlusTree {
    private Node root;
    private int rank;
//    private Class keyClass;


    public BPlusTreeImpl(int rank) {
        this.rank = rank;
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
        if (node.isRoot() && node.isLeaf()) {
            return;
        }
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
                if (previousNode == null
                        || (followingNode != null && previousNode.getRank() > followingNode.getRank())
                ) {
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
                    var parent = (NonLeafNode) node.getParent();
                    if (usePrevious) {
                        rightNode.borrowChildrenFrom(leftNode);
                    } else {
                        leftNode.borrowChildrenFrom(rightNode);
                    }
                    parent.updateKey(rightNode);
                }
            }
        }
    }

    @Override
    public void print() {
        if (root != null) {
            root.printSubTree("", true);
        } else {
            System.out.println("└──no vertex");
        }
    }

    public static void main(String[] args) {
        var tree = testInsert();
        testDelete(tree);
    }

    private static BPlusTree testInsert() {
        BPlusTree tree  = new BPlusTreeImpl(3);
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
        tree.insert(58, 58);
        tree.insert(61, 61);
//        tree.print();
        return tree;
    }

    private static void testDelete(BPlusTree tree) {
//        tree.print();
        tree.delete(22);
//        tree.print();
        tree.delete(16);
//        tree.print();
        tree.delete(11);
        tree.delete(8);
//        tree.print();
        tree.delete(31);
//        tree.print();
        tree.delete(17);
//        tree.print();
        tree.delete(41);
//        tree.print();
        tree.delete(61);
//        tree.print();
        tree.delete(12);
//        tree.print();
        tree.delete(52);
        tree.delete(58);
        tree.delete(23);
        tree.print();
    }

    private int getMinimumRank() {
        return (rank - 1) / 2 + 1;
    }

    private void setRoot(Node node) {
        root = node;
        root.setParent(null);
    }

    public static int compareKeys(Object key1, Object key2) {
        if (key1 instanceof MaxValue || key2 instanceof MinValue) {
            return 1;
        } else if (key1 instanceof MinValue || key2 instanceof MaxValue) {
            return -1;
        }
        return ((Comparable) key1).compareTo(key2);
    }
}
