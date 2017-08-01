/**
 * Created by a.lebedjko on 2016.03.25..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfTestCases = Integer.parseInt(reader.readLine());
        ArrayList<String> resultSet = new ArrayList<>();

        for (int i = 0; i < numberOfTestCases; i++)
        {
            BigDecimal nthTerm = BigDecimal.valueOf(0);
            String result = "";
            String[] inputStringArray = reader.readLine().split("\\s+");
            BigDecimal a = BigDecimal.valueOf(Long.parseLong(inputStringArray[0]));
            BigDecimal b = BigDecimal.valueOf(Long.parseLong(inputStringArray[1]));
            Integer n = Integer.parseInt(inputStringArray[2]);
            nthTerm = a;
            for (int j = 0; j < n;j++)
            {

                BigDecimal toPow = BigDecimal.valueOf(2);
                BigDecimal nextMember = BigDecimal.valueOf(toPow.pow(j).longValue() * b.longValue());
                nthTerm = nthTerm.add(nextMember);
                result += nthTerm +" ";
            }
            resultSet.add(result.trim());

        }

        for (String s:resultSet)
        {
            System.out.println(s);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named OneDimensionArray. */
    }
}