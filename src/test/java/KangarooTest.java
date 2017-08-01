import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class KangarooTest {
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
    public void testKangarooMeets() {
        String expectedResult = "YES";

        Integer firstKangarooStartLocation = 0;
        Integer firstKangarooSpeed = 3;
        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        Integer secondKangarooStartLocation = 4;
        Integer secondKangarooSpeed = 2;
        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String actualResult = Kangaroo.kangaroo(firstKangaroo, secondKangaroo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKangarooNeverMeetsWhenBothStartLocationAndSpeedAreGreater() {
        String expectedResult = "NO";

        Integer firstKangarooStartLocation = 10;
        Integer firstKangarooSpeed = 3;
        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        Integer secondKangarooStartLocation = 4;
        Integer secondKangarooSpeed = 2;
        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String actualResult = Kangaroo.kangaroo(firstKangaroo, secondKangaroo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFirstKangarooAheadButSlowerAndKangaroosMeets(){
        String expectedResult = "YES";

        Integer firstKangarooStartLocation = 10;
        Integer firstKangarooSpeed = 3;
        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        Integer secondKangarooStartLocation = 4;
        Integer secondKangarooSpeed = 4;
        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String actualResult = Kangaroo.kangaroo(firstKangaroo, secondKangaroo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFirstKangarooAheadButSlowerAndKangaroosNeverMeets(){
        String expectedResult = "NO";

        Integer firstKangarooStartLocation = 10;
        Integer firstKangarooSpeed = 3;
        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        Integer secondKangarooStartLocation = 4;
        Integer secondKangarooSpeed = 8;
        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String actualResult = Kangaroo.kangaroo(firstKangaroo, secondKangaroo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSecondKangarooAheadButSlowerAndKangaroosMeets(){
        String expectedResult = "YES";

        Integer firstKangarooStartLocation = 4;
        Integer firstKangarooSpeed = 4;
        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        Integer secondKangarooStartLocation = 10;
        Integer secondKangarooSpeed = 3;
        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String actualResult = Kangaroo.kangaroo(firstKangaroo, secondKangaroo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSecondKangarooAheadButSlowerAndKangaroosNeverMeets(){
        String expectedResult = "NO";

        Integer firstKangarooStartLocation = 4;
        Integer firstKangarooSpeed = 8;
        Kangaroo firstKangaroo = new Kangaroo(firstKangarooStartLocation, firstKangarooSpeed);

        Integer secondKangarooStartLocation = 10;
        Integer secondKangarooSpeed = 3;
        Kangaroo secondKangaroo = new Kangaroo(secondKangarooStartLocation, secondKangarooSpeed);

        String actualResult = Kangaroo.kangaroo(firstKangaroo, secondKangaroo);
        assertEquals(expectedResult, actualResult);
    }
}
