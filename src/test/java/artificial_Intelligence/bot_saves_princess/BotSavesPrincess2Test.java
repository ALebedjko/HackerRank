package artificial_Intelligence.bot_saves_princess;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class BotSavesPrincess2Test {

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
    public void testBotSavesPrincessSampleInput() throws IOException {
        String testInputString =
                "3\n" +
                        "---\n" +
                        "-m-\n" +
                        "p--";

        String expectedResult =
                "DOWN\n" +
                        "LEFT\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        BotSavesPrincess2.playBotSavesPrincess();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testBotSavesPrincess2SampleInput() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("5\n");
        stringBuilder.append("2 3\n");
        stringBuilder.append("-----\n");
        stringBuilder.append("-----\n");
        stringBuilder.append("p--m-\n");
        stringBuilder.append("-----\n");
        stringBuilder.append("-----");
        String testInputString = stringBuilder.toString();

        String expectedResult = "LEFT\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(testInputString.getBytes());
        System.setIn(testCaseInputStream);

        BotSavesPrincess2.playBotSavesPrincess();

        assertEquals(expectedResult, outContent.toString());
    }
}

