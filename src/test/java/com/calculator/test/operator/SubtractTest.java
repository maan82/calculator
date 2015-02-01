package com.calculator.test.operator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SubtractTest {
    private Subtract subtract = new Subtract();

    @Test
    public void testOperateShouldSubtract() {
        BigDecimal left = mock(BigDecimal.class);
        BigDecimal right = mock(BigDecimal.class);

        subtract.operate(left, right);

        verify(left).subtract(right);
    }

}