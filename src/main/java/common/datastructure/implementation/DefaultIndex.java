package common.datastructure.implementation;

import common.datastructure.Index;
import common.datastructure.restriction.Range;
import common.datastructure.restriction.Restriction;
import lombok.Getter;
import lombok.Setter;
import manager.index.bplustree.BPlusTree;
import manager.index.bplustree.BPlusTreeImpl;

import java.util.List;

public class DefaultIndex implements Index {
    @Getter
    private String columnName;
    @Getter
    private String indexName;
    private BPlusTree tree = new BPlusTreeImpl(5);

    public DefaultIndex(String columnName, String indexName) {
        this.columnName = columnName;
        this.indexName = indexName;
    }

    @Override
    public List<Integer> getTuplesIndex(Restriction restriction) {
        restriction.generateInternalForm();
        if (restriction.isEquationRestriction()) {
            return tree.find(restriction.getEquationValue());
        } else {
            return tree.find(restriction.getRange(), restriction.getNotEqualValues());
        }
    }

    @Override
    public List<Integer> getTuplesIndex(Range range) {
        return tree.find(range, null);
    }

    @Override
    public void update(Object key, int offset) {
        tree.insert(key, offset);
    }

    @Override
    public void delete(Restriction restriction) {
        restriction.generateInternalForm();
        if (restriction.isEquationRestriction()) {
            tree.delete(restriction.getEquationValue());
        } else {
            tree.delete(restriction.getRange(), restriction.getNotEqualValues());
        }
    }

    @Override
    public void delete(Object value) {
        tree.delete(value);
    }

    @Override
    public boolean exist(Object key) {
        return tree.exist(key);
    }

    public BPlusTree getTree() {
        return tree;
    }
}
