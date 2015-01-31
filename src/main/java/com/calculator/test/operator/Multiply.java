package com.calculator.test.operator;

public class Multiply extends Binary implements Operator {

    public static final String MULTIPLY = "MULTIPLY";

    public Multiply() {
        super(MULTIPLY);
    }

    @Override
    public Double operate(Double left, Double right) {
        return left * right;
    }
}
