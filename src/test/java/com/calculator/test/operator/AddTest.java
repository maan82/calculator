package com.calculator.test.operator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AddTest {
    private Add add = new Add();

    @Test
    public void testOperateShouldAdd() {
        BigDecimal left = mock(BigDecimal.class);
        BigDecimal right = mock(BigDecimal.class);

        add.operate(left, right);

        verify(left).add(right);
    }

}