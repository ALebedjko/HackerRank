import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.01.20..
 */
public class CurrencyFormatterTest {

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
    public void testPrintFormattedPayment() throws Exception{
        InputStream testCaseInputStream = new ByteArrayInputStream("12324.134".getBytes());
        System.setIn(testCaseInputStream);
        CurrencyFormatter.printFormattedPayment();
        assertEquals("US: $12,324.13\n" +
                        "India: Rs.12,324.13\n" +
                        "China: ￥12,324.13\n" +
                        "France: 12 324,13 €\n",
                outContent.toString());
    }

}
