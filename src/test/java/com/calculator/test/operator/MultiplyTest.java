package com.calculator.test.operator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultiplyTest {
    private Multiply multiply = new Multiply();

    @Test
    public void testExecuteShouldMultiply() {
        BigDecimal left = mock(BigDecimal.class);
        BigDecimal right = mock(BigDecimal.class);

        multiply.operate(left, right);

        verify(left).multiply(right);
    }

}