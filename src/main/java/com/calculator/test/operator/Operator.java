package com.calculator.test.operator;


import java.util.List;

/**
 * The {@code Operator} interface represents math operators.
 * This interface decouple actual operator implementation from
 * from rest of the code
 */
public interface Operator {

    /**
     * Perform math operation on the left and right operands.
     * @param operands operands of the operation
     * @return result of binary operator
     */
    public Double operate(List<Double> operands);
}
