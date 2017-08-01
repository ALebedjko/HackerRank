import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by a.lebedjko on 2017.01.18..
 */

public class Loops1 {

    private static final String whitespace = " ";
    private static final String multiplicationSign = "x";
    private static final String equalitySign = "=";
    private static final String invalidInputExceptionMessage = "Invalid input";
    private static final int iterationCount = 10;
    private static final int startingIterationNumber = 1;

    public static void printJavaLoops1Output() throws IOException, Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(reader.readLine());

        if (2 <= inputNumber && inputNumber <= 20) {
            for (int iterationValue = startingIterationNumber; iterationValue <= iterationCount; iterationValue++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(inputNumber);
                stringBuilder.append(whitespace);
                stringBuilder.append(multiplicationSign);
                stringBuilder.append(whitespace);
                stringBuilder.append(iterationValue);
                stringBuilder.append(whitespace);
                stringBuilder.append(equalitySign);
                stringBuilder.append(whitespace);
                stringBuilder.append(inputNumber * iterationValue);
                System.out.println(stringBuilder.toString());
            }
        } else {
            throw new Exception(invalidInputExceptionMessage);
        }
    }

    public static void main(String[] args) throws Exception  {
        printJavaLoops1Output();
    }
}