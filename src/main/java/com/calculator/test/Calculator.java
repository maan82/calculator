package com.calculator.test;

import java.math.BigDecimal;
import java.util.List;

public class Calculator {
    private List<Instruction> instructionList;

    public Calculator(List<Instruction> instructionList) {
        this.instructionList = instructionList;
    }

    public BigDecimal calculate() {
        BigDecimal result = getInitialValue();
        for (Instruction instruction: instructionList) {
            if (instruction.isApplyInstruction()) {
                break;
            }
            result = instruction.execute(result);
        }
        return result;
    }

    private BigDecimal getInitialValue() {
        Instruction lastInstruction = getLastInstruction();
        if (lastInstruction.isApplyInstruction()) {
            return lastInstruction.getOperand();
        }
        throw new InvalidInputException("Last instruction should be apply instruction");
    }

    private Instruction getLastInstruction() {
        int size = instructionList.size();
        return instructionList.get(size - 1);
    }
}
