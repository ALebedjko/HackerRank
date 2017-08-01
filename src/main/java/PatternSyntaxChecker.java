import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by a.lebedjko on 16.04.2017.
 */

public class PatternSyntaxChecker {
    public static void main(String[] args) throws IOException {
        checkPatternSyntax();
    }

    protected static void checkPatternSyntax() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());

        for (int index = 0; index < testCaseCount; index++) {
            String regex = reader.readLine();

            try {
                Pattern regexPattern = Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException patternSyntaxException) {
                System.out.println("Invalid");
            }

        }

    }
}
