package com.calculator.test.operator;

import java.math.BigDecimal;
import java.util.List;

public abstract class Binary implements Operator {


    public BigDecimal getLeftHandSideOperand(List<BigDecimal> operands) {
        return operands.get(0);
    }

    public BigDecimal getRightHandSideOperand(List<BigDecimal> operands) {
        return operands.get(1);
    }

    @Override
    public BigDecimal operate(List<BigDecimal> operands) {
        return operate(getLeftHandSideOperand(operands), getRightHandSideOperand(operands));
    }

    public abstract BigDecimal operate(BigDecimal left, BigDecimal right);

}
