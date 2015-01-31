package com.calculator.test.operator;

import java.util.HashMap;

import static com.calculator.test.operator.Add.ADD;
import static com.calculator.test.operator.Apply.APPLY;
import static com.calculator.test.operator.Divide.DIVIDE;
import static com.calculator.test.operator.Subtract.SUBTRACT;

public class OperatorSet {
    private HashMap<String, Operator> lookupMap;

    public OperatorSet() {
        HashMap<String, Operator> map = new HashMap<String, Operator>();
        map.put(ADD, new Add());
        map.put(SUBTRACT, new Subtract());
        map.put(APPLY, new Apply());
        map.put(Multiply.MULTIPLY, new Multiply());
        map.put(DIVIDE, new Divide());
        map.put(Increment.INCREMENT, new Increment());
        this.lookupMap = map;
    }

    public Operator get(String name) {
        Operator operator = lookupMap.get(name.toUpperCase());
        if (operator != null) {
            return operator;
        } else {
            throw new UnsupportedOperationException(name);
        }
    }
}
