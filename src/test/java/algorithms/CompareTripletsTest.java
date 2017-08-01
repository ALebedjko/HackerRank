package algorithms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static algorithms.CompareTriplets.ProblemAwardScore;
import static org.junit.Assert.assertEquals;

public class CompareTripletsTest {
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
    public void testFirstCandidateAllAwardsGrater() {
        int[] expectedResultArray = new int[]{3, 0};

        ProblemAwardScore firstCandidateAwardScore = new ProblemAwardScore(10, 10, 10);
        ProblemAwardScore secondCandidateAwardScore = new ProblemAwardScore(0, 0, 0);

        int[] actualResultArray = CompareTriplets.solve(firstCandidateAwardScore, secondCandidateAwardScore);

        assertEquals(expectedResultArray[0], actualResultArray[0]);
        assertEquals(expectedResultArray[1], actualResultArray[1]);
    }

    @Test
    public void testSecondCandidateAllAwardsGrater() {
        int[] expectedResultArray = new int[]{0, 3};

        ProblemAwardScore firstCandidateAwardScore = new ProblemAwardScore(0, 0, 0);
        ProblemAwardScore secondCandidateAwardScore = new ProblemAwardScore(10, 10, 10);

        int[] actualResultArray = CompareTriplets.solve(firstCandidateAwardScore, secondCandidateAwardScore);

        assertEquals(expectedResultArray[0], actualResultArray[0]);
        assertEquals(expectedResultArray[1], actualResultArray[1]);
    }

    @Test
    public void testCandidatesAwardsAllEquals() {
        int[] expectedResultArray = new int[]{0, 0};

        ProblemAwardScore firstCandidateAwardScore = new ProblemAwardScore(0, 0, 0);
        ProblemAwardScore secondCandidateAwardScore = new ProblemAwardScore(0, 0, 0);

        int[] actualResultArray = CompareTriplets.solve(firstCandidateAwardScore, secondCandidateAwardScore);

        assertEquals(expectedResultArray[0], actualResultArray[0]);
        assertEquals(expectedResultArray[1], actualResultArray[1]);
    }
}
