import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.03.17..
 */
public class Java1DArrayTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void testReadArraysAndPerformQueries() throws Exception{
        String inputString =
                        "4\n" +
                        "5 3\n" +
                        "0 0 0 0 0\n" +
                        "6 5\n" +
                        "0 0 0 1 1 1\n" +
                        "6 3\n" +
                        "0 0 1 1 1 0\n" +
                        "3 1\n" +
                        "0 1 0";
        InputStream testCaseInputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(testCaseInputStream);
        Java1DArray.readArraysAndPerformTestCases();

        String expectedResult =
                        "YES\n" +
                        "YES\n" +
                        "NO\n" +
                        "NO";
        assertEquals(expectedResult,
                outContent.toString());
    }
}
