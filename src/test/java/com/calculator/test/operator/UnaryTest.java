package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UnaryTest {

    @Test
    public void testGetRightHandSideOperand() {
        Unary unary = new Unary("") {
            @Override
            public Double operate(Double operand) {
                return null;
            }
        };
        ArrayList<Double> operands = Lists.newArrayList(10.0, 20.0);

        assertThat(unary.getOperand(operands), is(20.0));
    }

    @Test
    public void testOperateShouldDelegate() {
        final Double expected = 11.0;
        Unary unary = new Unary("") {
            @Override
            public Double operate(Double operand) {
                return expected;
            }
        };
        ArrayList<Double> operands = Lists.newArrayList(10.0);

        assertThat(unary.operate(operands), is(expected));
    }

}