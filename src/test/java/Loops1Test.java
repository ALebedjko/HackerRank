import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.01.18..
 */
public class Loops1Test {

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
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void test1JavaLoops1() throws Exception {
        InputStream testCaseInputStream = new ByteArrayInputStream("2".getBytes());
        System.setIn(testCaseInputStream);
        Loops1.printJavaLoops1Output();
        assertEquals(
                        "2 x 1 = 2\n" +
                        "2 x 2 = 4\n" +
                        "2 x 3 = 6\n" +
                        "2 x 4 = 8\n" +
                        "2 x 5 = 10\n" +
                        "2 x 6 = 12\n" +
                        "2 x 7 = 14\n" +
                        "2 x 8 = 16\n" +
                        "2 x 9 = 18\n" +
                        "2 x 10 = 20\n",
                outContent.toString());
    }

    @Test
    public void test2JavaLoops1() throws Exception {

        InputStream testCaseInputStream = new ByteArrayInputStream("3".getBytes());
        System.setIn(testCaseInputStream);
        Loops1.printJavaLoops1Output();
        assertEquals(
                        "3 x 1 = 3\n" +
                        "3 x 2 = 6\n" +
                        "3 x 3 = 9\n" +
                        "3 x 4 = 12\n" +
                        "3 x 5 = 15\n" +
                        "3 x 6 = 18\n" +
                        "3 x 7 = 21\n" +
                        "3 x 8 = 24\n" +
                        "3 x 9 = 27\n" +
                        "3 x 10 = 30\n",
                outContent.toString());
    }
}
