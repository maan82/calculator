package com.calculator.test.operator;

public class Divide extends Binary implements Operator {

    public static final String DIVIDE = "DIVIDE";

    public Divide() {
        super(DIVIDE);
    }

    @Override
    public Double operate(Double left, Double right) {
        return left / right;
    }

}
