package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DivideTest {

    private Divide divide = new Divide();

    @Test
    public void testOperateShouldDivide() {
        Double result = divide.operate(Lists.newArrayList(4.0, 2.0));
        assertThat(result, is(2.0));
    }

    @Test
    public void testOperateWhenDivideByZeroShouldReturnInfinity() {
        Double result = divide.operate(Lists.newArrayList(4.0, 0.0));
        assertThat(result, is(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testOperateWhenZeroDivideByNumberShouldReturnZero() {
        Double result = divide.operate(Lists.newArrayList(0.0, 6.0));
        assertThat(result, is(0.0));
    }

}