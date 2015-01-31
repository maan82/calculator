package com.calculator.test;

import com.calculator.test.factory.InstructionFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) throws FileNotFoundException {
        List<String> lines = new InputLinesReader().readLines(new FileReader(args[0]));
        System.out.println("-----Input instructions----");
        System.out.println(lines);
        System.out.println("-----Result------");
        InstructionFactory instructionFactory = new InstructionFactory();
        List<Instruction> instructionList = instructionFactory.create(lines);
        System.out.println(new Calculator(instructionList).calculate());
    }

}
