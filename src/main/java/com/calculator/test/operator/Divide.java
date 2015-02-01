package com.calculator.test.operator;

import java.math.BigDecimal;

public class Divide extends Binary implements Operator {

    @Override
    public BigDecimal operate(BigDecimal left, BigDecimal right) {
        return left.divide(right);
    }

}
