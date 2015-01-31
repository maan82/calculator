package com.calculator.test.operator;

public class Subtract extends Binary implements Operator {

    public static final String SUBTRACT = "SUBTRACT";

    public Subtract() {
        super(SUBTRACT);
    }

    @Override
    public Double operate(Double left, Double right) {
        return left - right;
    }

}
