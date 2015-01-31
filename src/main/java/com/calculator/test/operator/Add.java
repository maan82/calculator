package com.calculator.test.operator;

public class Add extends Binary implements Operator {

    public static final String ADD = "ADD";

    public Add() {
        super(ADD);
    }

    @Override
    public Double operate(Double left, Double right) {
        return left + right;
    }

}
