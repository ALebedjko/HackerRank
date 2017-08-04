package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            extractTagContentAndPrintAtConsole(line);
            testCases--;
        }
    }

    public static void extractTagContentAndPrintAtConsole(String inputLine) {
        String patternString = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(inputLine);

        int matchCount = 0;

        while (matcher.find()) {
            System.out.println(matcher.group(2));
            matchCount++;
        }

        if (matchCount == 0) {
            System.out.println("None");
        }
    }

}