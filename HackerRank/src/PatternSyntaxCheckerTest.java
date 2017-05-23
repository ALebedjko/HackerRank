import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 16.04.2017.
 */
public class PatternSyntaxCheckerTest {
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
    public void testCheckPatternSyntax() throws IOException {
        InputStream testCaseInputStream = new ByteArrayInputStream((
                "3\n" +
                "([A-Z])(.+)\n" +
                "[AZ[a-z](a-z)\n" +
                "batcatpat(nat")
                .getBytes());
        System.setIn(testCaseInputStream);

        PatternSyntaxChecker.checkPatternSyntax();
        assertEquals(
                "Valid\r\n" +
                "Invalid\r\n" +
                "Invalid\r\n", outContent.toString());
    }
}
