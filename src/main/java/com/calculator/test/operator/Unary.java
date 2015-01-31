package com.calculator.test.operator;

import java.util.List;

public abstract class Unary extends NamedOperator implements Operator {

    public Unary(String name) {
        super(name);
    }

    public Double getOperand(List<Double> operands) {
        return operands.get(operands.size() -1);
    }

    @Override
    public Double operate(List<Double> operands) {
        return operate(getOperand(operands));
    }

    public abstract Double operate(Double operand);
}
