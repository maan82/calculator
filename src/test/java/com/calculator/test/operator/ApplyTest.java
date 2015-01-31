package com.calculator.test.operator;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplyTest {

    @Test
    public void testOperateShouldReturnRightHandValue() {
        assertThat(new Apply().operate(Lists.newArrayList(10.0, 20.0)), is(20.0));
    }

}