package com.calculator.test.operator;

import java.math.BigDecimal;

public class Increment extends Unary implements Operator {

    @Override
    public BigDecimal operate(BigDecimal operand) {
        return operand.add(new BigDecimal(1));
    }
}
