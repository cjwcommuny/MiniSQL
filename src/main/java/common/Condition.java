package common;

public interface Condition {
    enum ConditionType {
        EQUAL,
        NOT_EQUAL,
        GREATER,
        LESS,
        GREATER_OR_EQUAL,
        LESS_OR_EQUAL,
        ;

        public static ConditionType construct(String op) {
            switch (op) {
                case "=":
                    return EQUAL;
                case "<>":
                    return NOT_EQUAL;
                case ">":
                    return GREATER;
                case "<":
                    return LESS;
                case ">=":
                    return GREATER_OR_EQUAL;
                case "<=":
                    return LESS_OR_EQUAL;
                default:
                    return null;
            }
        }
    }

    ConditionType getCompareType();
    String getColumnName();
    Object getValue();
}
