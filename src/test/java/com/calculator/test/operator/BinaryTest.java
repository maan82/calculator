package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinaryTest {

    @Test
    public void testGetLeftHandSideOperand() {
        Binary binaryOperator = new Binary("") {
            @Override
            public Double operate(Double left, Double right) {
                return null;
            }
        };
        ArrayList<Double> operands = Lists.newArrayList(10.0, 20.0);

        assertThat(binaryOperator.getLeftHandSideOperand(operands), is(10.0));
    }

    @Test
    public void testGetRightHandSideOperand() {
        Binary binaryOperator = new Binary("") {
            @Override
            public Double operate(Double left, Double right) {
                return null;
            }
        };
        ArrayList<Double> operands = Lists.newArrayList(10.0, 20.0);

        assertThat(binaryOperator.getRightHandSideOperand(operands), is(20.0));
    }

    @Test
    public void testOperateShouldDelegate() {
        final Double expected = 30.0;
        Binary binaryOperator = new Binary("") {
            @Override
            public Double operate(Double left, Double right) {
                return expected;
            }
        };
        ArrayList<Double> operands = Lists.newArrayList(10.0, 20.0);

        assertThat(binaryOperator.operate(operands), is(expected));
    }

}