import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.01.20..
 */
public class JavaStringTokensTest {
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
    public void testPrintTokenNumberAndTokensThemselves() throws Exception{
        InputStream testCaseInputStream = new ByteArrayInputStream("He is a very very good boy, isn't he?".getBytes());
        System.setIn(testCaseInputStream);
        StringTokens.printTokenNumberAndTokensThemselves();
        assertEquals("10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he\n" ,outContent.toString());

    }

    @Test
    public void test(){
        String[] errorSoon = {"10","He","is","a","very","very","good","boy","isn","t","he"};
        List<String> expectedStringTokenList = new ArrayList<String>(Arrays.asList(errorSoon));
        String stringToTokenize = "He is a very very good boy, isn't he?";
        List<String> resultStringTokenList = new ArrayList<>();
        List<String> stringTokenList = StringTokens.tokenizeStrings(stringToTokenize);
        resultStringTokenList.add(Integer.toString(stringTokenList.size()));
        resultStringTokenList.addAll(stringTokenList);
        assertEquals(expectedStringTokenList, resultStringTokenList);
    }
}
