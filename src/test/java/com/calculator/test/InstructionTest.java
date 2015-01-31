package com.calculator.test;

import com.calculator.test.operator.Add;
import com.calculator.test.operator.Apply;
import com.google.common.collect.Lists;
import com.calculator.test.operator.Operator;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class InstructionTest {

    @Test
    public void testExecuteShouldDelegateToOperator() {
        Operator operator = mock(Operator.class);
        Instruction instruction = new Instruction(Lists.newArrayList(5.0), operator);
        ArrayList<Double> expected = Lists.newArrayList(12.0, 5.0);
        when(operator.operate(expected)).thenReturn(17.0);

        Double actual = instruction.execute(12.0);

        assertThat(actual, is(17.0));
        verify(operator).operate(expected);
    }

    @Test
    public void testIsApplyInstructionWhenApplyInstanceShouldReturnTrue() {
        assertTrue(new Instruction(Lists.newArrayList(1.0), new Apply()).isApplyInstruction());
    }

    @Test
    public void testIsApplyInstructionWhenOtherOperatorShouldReturnFalse() {
        assertFalse(new Instruction(Lists.newArrayList(1.0), new Add()).isApplyInstruction());
    }

}