import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by a.lebedjko on 2017.01.18..
 */

public class JavaLoops1 {

    public static final String whitespace = " ";
    public static final String multiplicationSign = "x";
    public static final String equalitySign = "=";
    public static final String invalidInputExceptionMessage = "Invalid input";

    public static void printJavaLoops1Output() throws IOException, Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        if (2 <= N && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                // N + " " + "x" + " " + "i" + " " + "=" + "N * i"
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(N);
                stringBuilder.append(whitespace);
                stringBuilder.append(multiplicationSign);
                stringBuilder.append(whitespace);
                stringBuilder.append(i);
                stringBuilder.append(whitespace);
                stringBuilder.append(equalitySign);
                stringBuilder.append(whitespace);
                stringBuilder.append(N * i);
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