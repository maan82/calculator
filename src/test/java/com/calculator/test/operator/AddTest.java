package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AddTest {
    private Add add = new Add();

    @Test
    public void testOperateShouldAdd() {
        Double result = add.operate(Lists.newArrayList(1.0, 5.0));
        assertThat(result, is(6.0));
    }

    @Test
    public void testOperateShouldAddNegativeValues() {
        Double result = add.operate(Lists.newArrayList(-10.0, -5.0));
        assertThat(result, is(-15.0));
    }

    @Test
    public void testOperateShouldAddWhenLeftNegativeValue() {
        Double result = add.operate(Lists.newArrayList(10.0, -5.0));
        assertThat(result, is(5.0));
    }

    @Test
    public void testOperateShouldAddWhenRightNegativeValue() {
        Double result = add.operate(Lists.newArrayList(-8.0, 5.0));
        assertThat(result, is(-3.0));
    }

}