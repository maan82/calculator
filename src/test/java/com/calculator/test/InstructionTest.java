package com.calculator.test;

import com.calculator.test.operator.Add;
import com.calculator.test.operator.Apply;
import com.calculator.test.operator.Operator;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class InstructionTest {

    @Test
    public void testExecuteShouldDelegateToOperator() {
        Operator operator = mock(Operator.class);
        Instruction instruction = new Instruction(Lists.newArrayList(new BigDecimal(5)), operator);
        ArrayList<BigDecimal> expected = Lists.newArrayList(new BigDecimal(12), new BigDecimal(5));
        when(operator.operate(expected)).thenReturn(new BigDecimal(17));

        BigDecimal actual = instruction.execute(new BigDecimal(12));

        assertThat(actual, is(new BigDecimal(17)));
        verify(operator).operate(expected);
    }

    @Test
    public void testIsApplyInstructionWhenApplyInstanceShouldReturnTrue() {
        assertTrue(new Instruction(Lists.newArrayList(new BigDecimal(1)), new Apply()).isApplyInstruction());
    }

    @Test
    public void testIsApplyInstructionWhenOtherOperatorShouldReturnFalse() {
        assertFalse(new Instruction(Lists.newArrayList(new BigDecimal(1)), new Add()).isApplyInstruction());
    }

}