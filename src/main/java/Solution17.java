/**
 * Created by a.lebedjko on 2016.03.26..
 */
import java.io.*;
import java.util.*;

public class Solution17 {

    public static String capitalizeString(String s)
    {
        String capitalazedString = "";
        if (s.length()>0)
        {
            String capitalString = s.substring(0,1);
            String remainingString = s.substring(1,s.length());
            capitalString = capitalString.toUpperCase();
            capitalazedString =  capitalString + remainingString;

        }
        return capitalazedString;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        Integer sumOfLengths = A.length() + B.length();
        System.out.println(sumOfLengths);
        if (A.compareTo(B)<0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }



        System.out.println(capitalizeString(A)+ " " + capitalizeString(B));



        /* Enter your code here. Print output to STDOUT. */

    }
}
