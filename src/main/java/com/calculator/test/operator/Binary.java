package com.calculator.test.operator;

import java.util.List;

public abstract class Binary extends NamedOperator implements Operator {

    public Binary(String name) {
        super(name);
    }

    public Double getLeftHandSideOperand(List<Double> operands) {
        return operands.get(0);
    }

    public Double getRightHandSideOperand(List<Double> operands) {
        return operands.get(1);
    }

    @Override
    public Double operate(List<Double> operands) {
        return operate(getLeftHandSideOperand(operands), getRightHandSideOperand(operands));
    }

    public abstract Double operate(Double left, Double right);

}
