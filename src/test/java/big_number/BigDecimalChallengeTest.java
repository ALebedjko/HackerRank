package big_number;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class BigDecimalChallengeTest {

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

    @Ignore
    @Test
    public void testBigDecimalNumberReordering() throws IOException {
        String testInputString = "9\n" +
                "-100\n" +
                "50\n" +
                "0\n" +
                "56.6\n" +
                "90\n" +
                "0.12\n" +
                ".12\n" +
                "02.34\n" +
                "000.000";

        String expectedResult = "90\n" +
                "56.6\n" +
                "50\n" +
                "02.34\n" +
                "0.12\n" +
                ".12\n" +
                "0\n" +
                "000.000\n" +
                "-100";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        //BigIntegerChallenge.readInputAndPerformBothMethods();

        assertEquals(expectedResult, outContent.toString());
    }
}


