package com.calculator.test.operator;

import java.math.BigDecimal;

public class Apply extends Unary implements Operator {

    @Override
    public BigDecimal operate(BigDecimal operand) {
        return operand;
    }

}
