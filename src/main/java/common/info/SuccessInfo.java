package common.info;

public class SuccessInfo implements OrdinaryInfo {
    @Override
    public Rank getRank() {
        return Rank.INFO;
    }

    @Override
    public String getMessage() {
        return "success";
    }
}
