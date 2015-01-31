package com.calculator.test.operator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class OperatorSetTest {
    private OperatorSet operatorSet = new OperatorSet();

    @Test
    public void testGetReturnsAddOperator() {
        assertEquals(operatorSet.get("ADD"), new Add());
    }

    @Test
    public void testGetReturnsSubtractOperator() {
        assertEquals(operatorSet.get("SUBTRACT"), new Subtract());
    }

    @Test
    public void testGetReturnsMultiplyOperator() {
        assertEquals(operatorSet.get("MULTIPLY"), new Multiply());
    }

    @Test
    public void testGetReturnsDivideOperator() {
        assertEquals(operatorSet.get("DIVIDE"), new Divide());
    }

    @Test
    public void testGetReturnsIncrementOperator() {
        assertEquals(operatorSet.get("INCREMENT"), new Increment());
    }

    @Test
    public void testGetReturnsApplyOperator() {
        assertEquals(operatorSet.get("APPLY"), new Apply());
    }

    @Test
    public void testGetReturnsCaseInsensitive() {
        assertEquals(operatorSet.get("aDd"), new Add());
    }

    @Test
    public void testGetThrowsException() {
        try {
            operatorSet.get("test");
            fail();
        } catch (UnsupportedOperationException ex) {
            //pass
        }
    }

}