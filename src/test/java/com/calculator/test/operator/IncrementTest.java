package com.calculator.test.operator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class IncrementTest {

    private Increment increment = new Increment();

    @Test
    public void testOperateShouldAddOne() {
        BigDecimal operand = mock(BigDecimal.class);
        increment.operate(operand);

        verify(operand).add(new BigDecimal(1));
    }

}