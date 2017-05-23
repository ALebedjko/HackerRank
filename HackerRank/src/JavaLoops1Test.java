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
public class JavaLoops1Test {

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
        JavaLoops1.printJavaLoops1Output();
        assertEquals(
                        "2 x 1 = 2\r\n" +
                        "2 x 2 = 4\r\n" +
                        "2 x 3 = 6\r\n" +
                        "2 x 4 = 8\r\n" +
                        "2 x 5 = 10\r\n" +
                        "2 x 6 = 12\r\n" +
                        "2 x 7 = 14\r\n" +
                        "2 x 8 = 16\r\n" +
                        "2 x 9 = 18\r\n" +
                        "2 x 10 = 20\r\n",
                outContent.toString());
    }

    @Test
    public void test2JavaLoops1() throws Exception {

        InputStream testCaseInputStream = new ByteArrayInputStream("3".getBytes());
        System.setIn(testCaseInputStream);
        JavaLoops1.printJavaLoops1Output();
        assertEquals(
                        "3 x 1 = 3\r\n" +
                        "3 x 2 = 6\r\n" +
                        "3 x 3 = 9\r\n" +
                        "3 x 4 = 12\r\n" +
                        "3 x 5 = 15\r\n" +
                        "3 x 6 = 18\r\n" +
                        "3 x 7 = 21\r\n" +
                        "3 x 8 = 24\r\n" +
                        "3 x 9 = 27\r\n" +
                        "3 x 10 = 30\r\n",
                outContent.toString());
    }
}
