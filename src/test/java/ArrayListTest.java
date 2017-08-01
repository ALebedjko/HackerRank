import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
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
                "5\n" +
                "5 41 77 74 22 44\n" +
                "1 12\n" +
                "4 37 34 36 52\n" +
                "0\n" +
                "3 20 22 33\n" +
                "5\n" +
                "1 3\n" +
                "3 4\n" +
                "3 1\n" +
                "4 3\n" +
                "5 5";
        InputStream testCaseInputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(testCaseInputStream);
        ArrayList1.readArraysAndPerformQueries();

        String expectedResult =
                "74\n" +
                "52\n" +
                "37\n" +
                "ERROR!\n" +
                "ERROR!\n";

        assertEquals(expectedResult,
                outContent.toString());
    }
}
