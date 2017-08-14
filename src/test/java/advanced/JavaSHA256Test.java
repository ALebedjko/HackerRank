package advanced;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

public class JavaSHA256Test {

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
    public void testGetSHA256ValueOfFirstSampleInput() throws IOException, NoSuchAlgorithmException {
        String testInputString = "HelloWorld";
        String expectedResult = "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        JavaSHA256.readInputStringAndComputeHash();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testGetSHA256ValueOfSecondSampleInput() throws IOException, NoSuchAlgorithmException{
        String testInputString = "Javarmi123";
        String expectedResult = "f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        JavaSHA256.readInputStringAndComputeHash();

        assertEquals(expectedResult, outContent.toString());
    }

}