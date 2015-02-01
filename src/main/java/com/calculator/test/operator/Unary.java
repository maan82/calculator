package com.calculator.test.operator;

import java.math.BigDecimal;
import java.util.List;

public abstract class Unary implements Operator {

    public BigDecimal getOperand(List<BigDecimal> operands) {
        return operands.get(operands.size() -1);
    }

    @Override
    public BigDecimal operate(List<BigDecimal> operands) {
        return operate(getOperand(operands));
    }

    public abstract BigDecimal operate(BigDecimal operand);
}
