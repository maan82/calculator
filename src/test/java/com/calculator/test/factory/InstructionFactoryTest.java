package com.calculator.test.factory;

import com.calculator.test.Instruction;
import com.calculator.test.operator.Add;
import com.calculator.test.operator.Subtract;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InstructionFactoryTest {

    private InstructionFactory instructionFactory = new InstructionFactory();

    @Test
    public void testCreateShouldCreateWhenOneLine() {
        ArrayList<String> lines = Lists.newArrayList("ADD 2");
        Add add = new Add();
        List<BigDecimal> operands = Lists.newArrayList(new BigDecimal(2));
        List<Instruction> expected = Lists.newArrayList(new Instruction(operands, add));

        List<Instruction> actual = instructionFactory.create(lines);

        assertEquals(expected, actual);
    }

    @Test
    public void testCreateShouldCreateWhenMultipleLines() {
        ArrayList<String> lines = Lists.newArrayList("ADD 2", "SUBTRACT 3");
        Add add = new Add();
        Subtract subtract = new Subtract();
        List<BigDecimal> operands1 = Lists.newArrayList(new BigDecimal(2));
        List<BigDecimal> operands2 = Lists.newArrayList(new BigDecimal(3));

        List<Instruction> expected =
            Lists.newArrayList(new Instruction(operands1, add), new Instruction(operands2, subtract));

        List<Instruction> actual = instructionFactory.create(lines);

        assertEquals(expected, actual);
    }

}