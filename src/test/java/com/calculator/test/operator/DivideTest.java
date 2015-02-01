package com.calculator.test.operator;

import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DivideTest {

    private Divide divide = new Divide();

    @Test
    public void testOperateShouldDivide() {
        BigDecimal left = mock(BigDecimal.class);
        BigDecimal right = mock(BigDecimal.class);

        divide.operate(left, right);

        verify(left).divide(right);
    }

}