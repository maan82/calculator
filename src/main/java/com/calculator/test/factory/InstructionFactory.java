package com.calculator.test.factory;

import com.calculator.test.Instruction;
import com.calculator.test.operator.OperatorName;
import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstructionFactory {

    public List<Instruction> create(List<String> inputLines) {
        List<Instruction> list = new ArrayList<Instruction>();
        for(String line: inputLines) {
            String[] split = line.split(" ");
            List<String> operands = Arrays.asList(split).subList(1, split.length);
            List<BigDecimal> transformedOperands = Lists.transform(operands, new Function<String, BigDecimal>() {
                @Override
                public BigDecimal apply(String input) {
                    return new BigDecimal(input);
                }
            });

            list.add(new Instruction(transformedOperands, OperatorName.get(split[0])));
        }
        return list;
    }

}
