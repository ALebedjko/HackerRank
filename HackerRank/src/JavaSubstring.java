import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by a.lebedjko on 2017.01.09..
 */
public class JavaSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        String[] startEndString = reader.readLine().split("\\s+");
        if (startEndString.length != 0) {
            int start = Integer.parseInt(startEndString[0]);
            int end = Integer.parseInt(startEndString[1]);

            System.out.println(getSubstringedOutput(inputString, start, end));
        }
    }

    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


    public static String getSubstringedOutput(String inputString, int startIndex, int endIndex) throws IOException {
        if (inputString != null && inputString.length() >= 1 && inputString.length() <= 100 && isAlpha(inputString)) {
            if (startIndex >= 0 && endIndex > startIndex && endIndex <= inputString.length()) {
                return inputString.substring(startIndex, endIndex);
            }
        }
        return "";
    }

}

