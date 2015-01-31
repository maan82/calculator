package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SubtractTest {
    private Subtract subtract = new Subtract();

    @Test
    public void testOperateShouldSubtract() {
        Double result = subtract.operate(Lists.newArrayList(10.0, 7.0));
        assertThat(result, is(3.0));
    }

    @Test
    public void testOperateShouldSubtractNegativeValues() {
        Double result = subtract.operate(Lists.newArrayList(-10.0, -7.0));
        assertThat(result, is(-3.0));
    }

    @Test
    public void testOperateShouldSubtractWhenLeftNegativeValue() {
        Double result = subtract.operate(Lists.newArrayList(-10.0, 7.0));
        assertThat(result, is(-17.0));
    }

    @Test
    public void testOperateShouldSubtractWhenRightNegativeValue() {
        Double result = subtract.operate(Lists.newArrayList(1.0, -17.0));
        assertThat(result, is(18.0));
    }

}