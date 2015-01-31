package com.calculator.test;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class InputLinesReader {

    public List<String> readLines(Reader reader){
        try {
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> linesList = new ArrayList<String>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                linesList.add(line.trim());
            }
            return linesList;
        } catch (Exception ex) {
            throw new InvalidInputException("Failed to read input file");
        }
    }

}
