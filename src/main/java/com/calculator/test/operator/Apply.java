package com.calculator.test.operator;

import java.util.List;

public class Apply extends NamedOperator implements Operator {

    public static final String APPLY = "APPLY";

    public Apply() {
        super(APPLY);
    }

    @Override
    public Double operate(List<Double> operands) {
        return operands.get(operands.size() - 1);
    }

}
