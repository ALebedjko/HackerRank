package advanced;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

public class JavaMD5Test {

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
    public void testGetMD5ValueOfFirstSampleInput() throws IOException, NoSuchAlgorithmException{
        String testInputString = "HelloWorld";
        String expectedResult = "68e109f0f40ca72a15e05cc22786f8e6";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        JavaMD5.readInputStringAndComputeHash();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testGetMD5ValueOfSecondSampleInput() throws IOException, NoSuchAlgorithmException{
        String testInputString = "Javarmi123";
        String expectedResult = "2da2d1e0ce7b4951a858ed2d547ef485";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        JavaMD5.readInputStringAndComputeHash();

        assertEquals(expectedResult, outContent.toString());
    }

}