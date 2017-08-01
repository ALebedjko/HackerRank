/**
 * Created by a.lebedjko on 2016.03.17..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer valueToSearch = Integer.parseInt(reader.readLine()) ;
        Integer sizeOfArray = Integer.parseInt(reader.readLine());
        String[] stringOfNumbersToMakeArray = reader.readLine().split("\\s+");

        ArrayList<Integer> arrayOfInts = new ArrayList<>();
        int index = 0;

        for (String s: stringOfNumbersToMakeArray
             )
        {
            if (s.equals(valueToSearch.toString()))
            {
                System.out.println(index);
            }
            index++;
        }

    }
}