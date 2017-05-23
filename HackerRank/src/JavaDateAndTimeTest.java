import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.01.19..
 */
public class JavaDateAndTimeTest {

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
    public void test1JavaDateAndTime() throws Exception {
        InputStream testCaseInputStream = new ByteArrayInputStream("08 05 2015".getBytes());
        System.setIn(testCaseInputStream);
        JavaDateAndTime.printDayNameByDate();
        assertEquals("WEDNESDAY\r\n",
                outContent.toString());

    }

    @Test(expected = Exception.class)
    public void test2JavaDateAndTime() throws Exception {
        InputStream testCaseInputStream = new ByteArrayInputStream("05 2015".getBytes());
        System.setIn(testCaseInputStream);
        JavaDateAndTime.printDayNameByDate();
        assertEquals("WEDNESDAY\r\n",
                outContent.toString());

    }
}

