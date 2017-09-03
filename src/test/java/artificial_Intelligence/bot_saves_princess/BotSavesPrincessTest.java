package artificial_Intelligence.bot_saves_princess;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class BotSavesPrincessTest {

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

        BotSavesPrincess.playBotSavesPrincess();

        assertEquals(expectedResult, outContent.toString());
    }
}


