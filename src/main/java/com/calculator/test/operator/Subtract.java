package com.calculator.test.operator;

import java.math.BigDecimal;

public class Subtract extends Binary implements Operator {

    @Override
    public BigDecimal operate(BigDecimal left, BigDecimal right) {
        return left.subtract(right);
    }

}
