/**
 * Created by a.lebedjko on 2016.03.26..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution18 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        Integer substringLength = Integer.parseInt(reader.readLine());

        ArrayList<String> substringedList = new ArrayList<>();
        String currentString = "";
        for (int i = 0; i < inputString.length(); i++)
        {
            Integer endIndex = i+substringLength;
            if (endIndex<=inputString.length())
            {
                currentString = inputString.substring(i, endIndex);
                substringedList.add(currentString);
            }
        }
        Collections.sort(substringedList);
        ArrayList<String> resultArray = new ArrayList<>();
        if (substringedList.size()>0) {
            String minSubstring = substringedList.get(0);
            resultArray.add(minSubstring);
            String maxSubstring = substringedList.get(substringedList.size()-1);
            resultArray.add(maxSubstring);
        }

        for (String s:resultArray
             ) {
            System.out.println(s);
        }

    }
}