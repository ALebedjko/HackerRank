/**
 * Created by a.lebedjko on 2016.03.11..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        getSum(input);
        String input1 = reader.readLine();
        getSum(input1);

    }

    public static void getSum(String input)
    {
        String[] splitArray = input.split("\\s+");

        Long sum = Long.parseLong("0");
        for (String s:splitArray
                )
        {
            sum += Long.parseLong(s);
        }

        System.out.println(sum);
    }
}