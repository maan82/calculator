package com.calculator.test;

import java.util.List;

public class Calculator {
    private List<Instruction> instructionList;

    public Calculator(List<Instruction> instructionList) {
        this.instructionList = instructionList;
    }

    public Double calculate() {
        Instruction lastInstruction = getLastInstruction();
        if (lastInstruction.isApplyInstruction()) {
            Double result = lastInstruction.getOperand();
            for (Instruction instruction: instructionList) {
                if (instruction.isApplyInstruction()) {
                    break;
                }
                result = instruction.execute(result);
            }
            return result;
        } else {
            throw new InvalidInputException("Last instruction should be apply instruction");
        }
    }

    private Instruction getLastInstruction() {
        int size = instructionList.size();
        return instructionList.get(size - 1);
    }
}
