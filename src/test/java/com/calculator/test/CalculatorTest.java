package com.calculator.test;

import com.calculator.test.operator.Add;
import com.calculator.test.operator.Apply;
import com.calculator.test.operator.Subtract;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        Instruction addInstruction = new Instruction(Lists.newArrayList(new BigDecimal(1)), new Add());
        Instruction subtractInstruction = new Instruction(Lists.newArrayList(new BigDecimal(4)), new Subtract());
        Instruction applyInstruction = new Instruction(Lists.newArrayList(new BigDecimal(4)), new Apply());
        ArrayList<Instruction> instructions = Lists.newArrayList(addInstruction, subtractInstruction, applyInstruction);

        Calculator calculator = new Calculator(instructions);

        assertThat(calculator.calculate(), is(new BigDecimal(1)));
    }

    @Test
    public void testCalculateShouldThrowExceptionWhenInstructionsNotComplete() {
        Instruction addInstruction = new Instruction(Lists.newArrayList(new BigDecimal(1)), new Add());
        ArrayList<Instruction> instructions = Lists.newArrayList(addInstruction);
        try {
            new Calculator(instructions).calculate();
            fail();
        } catch (InvalidInputException ex) {
            // pass
        }
    }

}