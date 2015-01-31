package com.calculator.test;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppRunnerTest {
    private final String lineSeparator =  System.getProperty("line.separator");

    @Test
    public void testMainEndToEnd() throws FileNotFoundException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        AppRunner.main(new String[]{"input.txt"});

        String expected = "-----Input instructions----" +
            lineSeparator+"[add 3, apply 4]" +
            lineSeparator+"-----Result------" +
            lineSeparator+"7.0" +
            lineSeparator;
        assertThat(output.toString(), is(expected));
    }
}