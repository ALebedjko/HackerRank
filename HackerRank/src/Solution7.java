/**
 * Created by a.lebedjko on 2016.03.17..
 */
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayOfInts = new ArrayList<>();
        String[] inputValues = reader.readLine().split("\\s+");
        for (String s: inputValues
             )
        {
            arrayOfInts.add(Integer.parseInt(s));
        }

        BigDecimal bigA = BigDecimal.valueOf(arrayOfInts.get(0));
        BigDecimal a = BigDecimal.valueOf(arrayOfInts.get(0));
        BigDecimal b = BigDecimal.valueOf(arrayOfInts.get(1));
        Integer n = arrayOfInts.get(2);
        BigDecimal NthTerm = new BigDecimal(0);

        for (int i = 2; i < n; i++) {

            NthTerm = b.multiply(b).add(a);
            a = b;
            b = NthTerm;
            System.out.println("NthTerm" + "(" + i + ") = "+ NthTerm + "; next a = " + a + "; next b = " + b);
        }
        System.out.println(NthTerm);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Java1DArray. */
    }
}
