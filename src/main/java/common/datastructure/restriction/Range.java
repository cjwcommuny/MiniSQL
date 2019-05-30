package common.datastructure.restriction;

import common.datastructure.MaxValue;
import common.datastructure.MinValue;
import lombok.Data;

import static manager.index.bplustree.BPlusTreeImpl.compareKeys;

@Data
class Range {
    private Object leftValue;
    private Object rightValue;
    private boolean leftOpen;
    private boolean rightOpen;

    Range intersect(Range another) {
        Range range = new Range();
        int leftCompare = compareKeys(leftValue, another.leftValue);
        int rightCompare = compareKeys(rightValue, another.rightValue);
        if (leftCompare > 0) {
            range.setLeftValue(leftValue);
            range.setLeftOpen(leftOpen);
        } else if (leftCompare < 0) {
            range.setLeftValue(another.leftValue);
            range.setLeftOpen(another.leftOpen);
        } else {
            range.setLeftValue(leftValue);
            range.setLeftOpen(leftOpen || another.leftOpen);
        }

        if (rightCompare < 0) {
            range.setRightValue(rightValue);
            range.setRightOpen(rightOpen);
        } else if (rightCompare > 0) {
            range.setRightValue(another.rightValue);
            range.setRightOpen(another.rightOpen);
        } else {
            range.setRightValue(rightValue);
            range.setRightOpen(rightOpen || another.rightOpen);
        }
        return range;
    }

    static Object getMaxValue() {
        return new MaxValue();
    }

    static Object getMinValue() {
        return new MinValue();
    }

    Range(Object leftValue, Object rightValue, boolean leftOpen, boolean rightOpen) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.leftOpen = leftOpen;
        this.rightOpen = rightOpen;
    }

    private Range() {}
}
