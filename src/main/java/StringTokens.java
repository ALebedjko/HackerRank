import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by a.lebedjko on 2017.01.20..
 */
public class StringTokens {

    public static void main(String[] args) throws IOException {
        printTokenNumberAndTokensThemselves();
    }

    public static void printTokenNumberAndTokensThemselves() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringToTokenize = bufferedReader.readLine();

        List<String> tokenList = tokenizeStrings(stringToTokenize);

        System.out.println(tokenList.size());
        for (String token : tokenList
                ) {
            System.out.println(token);
        }
    }

    public static List<String> tokenizeStrings(String stringToTokenize) {
        List<String> stringTokenList = new ArrayList<>();
        if (!isEmpty(stringToTokenize)) {
            stringToTokenize = stringToTokenize.replaceAll("'", " ");
            String regex = "[^a-zA-Z\\d\\s:]";
            stringToTokenize = stringToTokenize.replaceAll(regex, "");
            stringToTokenize = stringToTokenize.trim();
            stringTokenList = Arrays.asList(stringToTokenize.split(" "));
        }
        return stringTokenList;
    }

    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(str));
    }
}
