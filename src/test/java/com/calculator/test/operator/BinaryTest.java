package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinaryTest {

    @Test
    public void testGetLeftHandSideOperand() {
        Binary binaryOperator = new Binary() {
            @Override
            public BigDecimal operate(BigDecimal left, BigDecimal right) {
                return null;
            }
        };
        BigDecimal expected = new BigDecimal(10);
        ArrayList<BigDecimal> operands = Lists.newArrayList(expected, new BigDecimal(20));

        assertThat(binaryOperator.getLeftHandSideOperand(operands), is(expected));
    }

    @Test
    public void testGetRightHandSideOperand() {
        Binary binaryOperator = new Binary() {
            @Override
            public BigDecimal operate(BigDecimal left, BigDecimal right) {
                return null;
            }
        };
        BigDecimal expected = new BigDecimal(20);
        ArrayList<BigDecimal> operands = Lists.newArrayList(new BigDecimal(10), expected);

        assertThat(binaryOperator.getRightHandSideOperand(operands), is(expected));
    }

    @Test
    public void testOperateShouldDelegate() {
        final BigDecimal expected = new BigDecimal(30);
        Binary binaryOperator = new Binary() {
            @Override
            public BigDecimal operate(BigDecimal left, BigDecimal right) {
                return expected;
            }
        };
        ArrayList<BigDecimal> operands = Lists.newArrayList(new BigDecimal(10), new BigDecimal(20));

        assertThat(binaryOperator.operate(operands), is(expected));
    }

}