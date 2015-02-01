package com.calculator.test.operator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ApplyTest {

    @Test
    public void testOperateShouldReturnRightHandValue() {
        assertThat(new Apply().operate(new BigDecimal(20)), is(new BigDecimal(20)));
    }

}