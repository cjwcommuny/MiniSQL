package common.info;

public class StringLengthExcessLimitError implements OrdinaryInfo {
    private Object value;

    public StringLengthExcessLimitError(Object value) {
        this.value = value;
    }

    @Override
    public Rank getRank() {
        return Rank.ERROR;
    }

    @Override
    public String getMessage() {
        return "string '" + value + "' length excesses limit";
    }
}
