package com.calculator.test.operator;

public class Increment extends Unary implements Operator {

    public static final String INCREMENT = "INCREMENT";

    public Increment() {
        super(INCREMENT);
    }

    @Override
    public Double operate(Double operand) {
        return operand + 1;
    }
}
