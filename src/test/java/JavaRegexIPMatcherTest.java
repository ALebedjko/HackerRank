import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 17.04.2017.
 */
public class JavaRegexIPMatcherTest {
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
    public void testJavaRegexIPMatcher(){

        InputStream testCaseInputStream = new ByteArrayInputStream((
                        "000.12.12.034\n" +
                        "121.234.12.12\n" +
                        "23.45.12.56\n" +
                        "00.12.123.123123.123\n" +
                        "122.23\n" +
                        "Hello.IP")
                        .getBytes());
        System.setIn(testCaseInputStream);
        RegexIPMatcher.checkIfValidIpAddress();
        assertEquals(
                "true\n" +
                        "true\n" +
                        "true\n" +
                        "false\n" +
                        "false\n" +
                        "false\n",
                        outContent.toString());

    }
}
