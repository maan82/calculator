package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnaryTest {

    @Test
    public void testGetRightHandSideOperand() {
        Unary unary = new Unary() {
            @Override
            public BigDecimal operate(BigDecimal operand) {
                return null;
            }
        };
        ArrayList<BigDecimal> operands = Lists.newArrayList(new BigDecimal(10), new BigDecimal(20));

        assertThat(unary.getOperand(operands), is(new BigDecimal(20)));
    }

    @Test
    public void testOperateShouldDelegate() {
        final BigDecimal expected = new BigDecimal(11);
        Unary unary = new Unary() {
            @Override
            public BigDecimal operate(BigDecimal operand) {
                return expected;
            }
        };
        ArrayList<BigDecimal> operands = Lists.newArrayList(new BigDecimal(10));

        assertThat(unary.operate(operands), is(expected));
    }

}