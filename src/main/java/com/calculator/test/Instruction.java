package com.calculator.test;

import com.calculator.test.operator.Apply;
import com.calculator.test.operator.Operator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Instruction {
    private List<BigDecimal> operands;
    private Operator operator;

    public Instruction(List<BigDecimal> operands, Operator operator) {
        this.operands = operands;
        this.operator = operator;
    }

    public BigDecimal execute(BigDecimal result) {
        ArrayList<BigDecimal> allOperands = new ArrayList<BigDecimal>();
        allOperands.add(result);
        allOperands.addAll(operands);
        return operator.operate(allOperands);
    }

    public boolean isApplyInstruction() {
        return operator instanceof Apply;
    }

    public BigDecimal getOperand() {
        return operands.get(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Instruction that = (Instruction) o;

        if (!operands.equals(that.operands)) return false;
        if (!operator.getClass().equals(that.operator.getClass())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operands.hashCode();
        result = 31 * result + operator.getClass().hashCode();
        return result;
    }
}
