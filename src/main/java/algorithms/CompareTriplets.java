package algorithms;

import java.util.Scanner;

public class CompareTriplets {

    static int[] solve(ProblemAwardScore firstCandidateProblemAwardScore, ProblemAwardScore secondCandidateProblemAwardScore) {
        int firstCandidateScorePointsAgainstSecond = firstCandidateProblemAwardScore.getScoreAgainstOtherCandidate(secondCandidateProblemAwardScore);
        int secondCandidateScorePointsAgainstFirst = secondCandidateProblemAwardScore.getScoreAgainstOtherCandidate(firstCandidateProblemAwardScore);

        return new int[]{firstCandidateScorePointsAgainstSecond, secondCandidateScorePointsAgainstFirst};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int aliceProblemClarityAwardingPoints = in.nextInt();
        int aliceOriginalityAwardingPoints = in.nextInt();
        int aliceDifficultyAwardingPoints = in.nextInt();
        ProblemAwardScore aliceProblemAwardScore = new ProblemAwardScore(aliceProblemClarityAwardingPoints,
                aliceOriginalityAwardingPoints, aliceDifficultyAwardingPoints);

        int bobProblemClarityAwardingPoints = in.nextInt();
        int bobOriginalityAwardingPoints = in.nextInt();
        int bobDifficultyAwardingPoints = in.nextInt();
        ProblemAwardScore bobProblemAwardScore = new ProblemAwardScore(bobProblemClarityAwardingPoints,
                bobOriginalityAwardingPoints, bobDifficultyAwardingPoints);

        int[] result = solve(aliceProblemAwardScore, bobProblemAwardScore);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }

    static class ProblemAwardScore {
        int problemClarityAwardingPoints;
        int problemOriginalityAwardingPoints;
        int problemDifficultyAwardingPoints;

        public ProblemAwardScore(int problemClarityAwardingPoints, int problemOriginalityAwardingPoints, int problemDifficultyAwardingPoints) {
            this.problemClarityAwardingPoints = problemClarityAwardingPoints;
            this.problemOriginalityAwardingPoints = problemOriginalityAwardingPoints;
            this.problemDifficultyAwardingPoints = problemDifficultyAwardingPoints;
        }

        public int getScoreAgainstOtherCandidate(ProblemAwardScore otherCandidateProblemAwardScore){
            int score = 0;

            ProblemAwardScore that = otherCandidateProblemAwardScore;
            if (problemClarityAwardingPoints > that.problemClarityAwardingPoints) score++;
            if (problemOriginalityAwardingPoints > that.problemOriginalityAwardingPoints) score++;
            if (problemDifficultyAwardingPoints > that.problemDifficultyAwardingPoints) score++;

            return score;
        }
    }
}