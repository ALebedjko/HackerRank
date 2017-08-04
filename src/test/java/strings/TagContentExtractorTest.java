package strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TagContentExtractorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testSampleInputFirstLine() {
        String firstExpectedLine = "Nayeem loves counseling\n";
        String firstInputTestLine = "<h1>Nayeem loves counseling</h1>";

        TagContentExtractor.extractTagContentAndPrintAtConsole(firstInputTestLine);

        assertEquals(firstExpectedLine, outContent.toString());
    }

    @Test
    public void testSampleInputSecondLine() {
        String secondExpectedResult = "Sanjay has no watch\n" +
                "So wait for a while\n";
        String secondInputTestLine = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

        TagContentExtractor.extractTagContentAndPrintAtConsole(secondInputTestLine);

        assertEquals(secondExpectedResult, outContent.toString());
    }

}
