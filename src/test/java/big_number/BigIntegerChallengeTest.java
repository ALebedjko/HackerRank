package big_number;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class BigIntegerChallengeTest {

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
    public void testBigIntegerAdditionAndMultiply() throws IOException {
        String testInputString = "1234\n" +
                "20";

        String expectedResult = "1254\n" +
                "24680\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        BigIntegerChallenge.readInputAndPerformBothMethods();

        assertEquals(expectedResult, outContent.toString());
    }
}
