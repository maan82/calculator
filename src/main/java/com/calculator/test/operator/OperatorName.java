package com.calculator.test.operator;

public enum OperatorName {
    ADD(new Add()),
    SUBTRACT(new Subtract()),
    MULTIPLY(new Multiply()),
    DIVIDE(new Divide()),
    APPLY(new Apply()),
    INCREMENT(new Increment());

    private Operator operator;

    OperatorName(Operator operator) {
        this.operator = operator;
    }

    public static Operator get(String name) {
        for (OperatorName operatorName: OperatorName.values()) {
            if (operatorName.toString().equalsIgnoreCase(name)) {
                return operatorName.operator;
            }
        }
        throw new UnsupportedOperationException(name);
    }
}
