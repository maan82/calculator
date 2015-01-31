package com.calculator.test.factory;

import com.calculator.test.Instruction;
import com.google.common.collect.Lists;
import com.calculator.test.operator.Add;
import com.calculator.test.operator.OperatorSet;
import com.calculator.test.operator.Subtract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InstructionFactoryTest {
    @Mock
    private OperatorSet operatorSet;

    @InjectMocks
    private InstructionFactory instructionFactory = new InstructionFactory();

    @Test
    public void testCreateShouldCreateWhenOneLine() {
        ArrayList<String> lines = Lists.newArrayList("ADD 2");
        Add add = new Add();
        List<Double> operands = Lists.newArrayList(2.0);
        when(operatorSet.get("ADD")).thenReturn(add);
        List<Instruction> expected = Lists.newArrayList(new Instruction(operands, add));

        List<Instruction> actual = instructionFactory.create(lines);

        assertEquals(expected, actual);
    }

    @Test
    public void testCreateShouldCreateWhenMultipleLines() {
        ArrayList<String> lines = Lists.newArrayList("ADD 2", "SUBTRACT 3");
        Add add = new Add();
        Subtract subtract = new Subtract();
        List<Double> operands1 = Lists.newArrayList(2.0);
        List<Double> operands2 = Lists.newArrayList(3.0);

        when(operatorSet.get("ADD")).thenReturn(add);
        when(operatorSet.get("SUBTRACT")).thenReturn(subtract);
        List<Instruction> expected =
            Lists.newArrayList(new Instruction(operands1, add), new Instruction(operands2, subtract));

        List<Instruction> actual = instructionFactory.create(lines);

        assertEquals(expected, actual);
    }

}