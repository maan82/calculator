package com.calculator.test;

import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class InputLinesReaderTest {
    private InputLinesReader inputLinesReader;
    private final String lineSeparator = System.getProperty("line.separator");

    @Before
    public void setUp() throws Exception {
        inputLinesReader = new InputLinesReader();
    }

    @Test
    public void testReadLinesShouldCreateListWhenOneLine() throws Exception {
        String lineOne = "ONE";
        List<String> lines = inputLinesReader.readLines(new StringReader(lineOne));

        assertEquals(1, lines.size());
        assertTrue(lineOne.equals(lines.get(0)));
    }

    @Test
    public void testReadLinesShouldThrowInvalidInputExceptionWhenException() throws Exception {
        try {
            inputLinesReader.readLines(null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof InvalidInputException);
        }
    }

    @Test
    public void testReadLinesShouldCreateListWhenManyLines() throws Exception {
        String lineOne = "ONE"+lineSeparator+"TWO"+lineSeparator+"THREE";

        List<String> lines = inputLinesReader.readLines(new StringReader(lineOne));

        assertEquals(3, lines.size());
        assertTrue("ONE".equals(lines.get(0)));
        assertTrue("TWO".equals(lines.get(1)));
        assertTrue("THREE".equals(lines.get(2)));
    }

    @Test
    public void testReadLinesShouldCreateListWhenSlashNInLineSeparator() throws Exception {
        String lineOne = "ONE\nTWO\nTHREE";

        List<String> lines = inputLinesReader.readLines(new StringReader(lineOne));

        assertEquals(3, lines.size());
        assertTrue("ONE".equals(lines.get(0)));
        assertTrue("TWO".equals(lines.get(1)));
        assertTrue("THREE".equals(lines.get(2)));
    }

    @Test
    public void testReadLinesShouldCreateListWhenCarriageReturnInLineSeparator() throws Exception {
        String lineOne = "ONE\r\nTWO\r\nTHREE";

        List<String> lines = inputLinesReader.readLines(new StringReader(lineOne));

        assertEquals(3, lines.size());
        assertTrue("ONE".equals(lines.get(0)));
        assertTrue("TWO".equals(lines.get(1)));
        assertTrue("THREE".equals(lines.get(2)));
    }

    @Test
    public void testReadLinesShouldTrimAndCreateListWhenManyLines() throws Exception {
        String lineOne = "ONE "+lineSeparator+" TWO "+lineSeparator+" THREE";

        List<String> lines = inputLinesReader.readLines(new StringReader(lineOne));

        assertEquals(3, lines.size());
        assertTrue("ONE".equals(lines.get(0)));
        assertTrue("TWO".equals(lines.get(1)));
        assertTrue("THREE".equals(lines.get(2)));
    }

}