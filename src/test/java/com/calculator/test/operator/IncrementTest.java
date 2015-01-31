package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IncrementTest {

    private Increment increment = new Increment();

    @Test
    public void testOperateShouldAddOne() {
        Double result = increment.operate(Lists.newArrayList(1.0));
        assertThat(result, is(2.0));
    }

    @Test
    public void testOperateWhenNegative() {
        Double result = increment.operate(Lists.newArrayList(-1.0));
        assertThat(result, is(0.0));
    }

}