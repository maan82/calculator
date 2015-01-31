package com.calculator.test.factory;

import com.calculator.test.Instruction;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.calculator.test.operator.OperatorSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstructionFactory {
    private OperatorSet operatorSet = new OperatorSet();

    public List<Instruction> create(List<String> inputLines) {
        List<Instruction> list = new ArrayList<Instruction>();
        for(String line: inputLines) {
            String[] split = line.split(" ");
            List<String> operands = Arrays.asList(split).subList(1, split.length);
            List<Double> doubles = Lists.transform(operands, new Function<String, Double>() {
                @Override
                public Double apply(String input) {
                    return new Double(input);
                }
            });

            list.add(new Instruction(doubles, operatorSet.get(split[0])));
        }
        return list;
    }

}
