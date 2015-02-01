package com.calculator.test.operator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OperatorNameTest {

    @Test
    public void testGetReturnsAdd() {
        assertTrue(OperatorName.get("ADD") instanceof Add);
    }

    @Test
    public void testGetReturnsSubtractOperator() {
        assertTrue(OperatorName.get("SUBTRACT") instanceof Subtract);
    }

    @Test
    public void testGetReturnsMultiplyOperator() {
        assertTrue(OperatorName.get("MULTIPLY") instanceof Multiply);
    }

    @Test
    public void testGetReturnsDivideOperator() {
        assertTrue(OperatorName.get("DIVIDE") instanceof Divide);
    }

    @Test
    public void testGetReturnsIncrementOperator() {
        assertTrue(OperatorName.get("INCREMENT") instanceof Increment);
    }

    @Test
    public void testGetReturnsApplyOperator() {
        assertTrue(OperatorName.get("APPLY") instanceof Apply);
    }

    @Test
    public void testGetReturnsCaseInsensitive() {
        assertTrue(OperatorName.get("aDd") instanceof Add);
    }

    @Test
    public void testGetThrowsException() {
        try {
            OperatorName.get("test");
            fail();
        } catch (UnsupportedOperationException ex) {
            //pass
        }
    }

}