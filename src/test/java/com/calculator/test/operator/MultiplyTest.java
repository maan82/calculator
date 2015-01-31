package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiplyTest {
    private Multiply multiply = new Multiply();

    @Test
    public void testExecuteShouldMultiply() {
        Double result = multiply.operate(Lists.newArrayList(2.0, 4.0));
        assertThat(result, is(8.0));
    }

    @Test
    public void testExecuteShouldMultiplyZero() {
        Double result = multiply.operate(Lists.newArrayList(0.0, 4.0));
        assertThat(result, is(0.0));
    }

}