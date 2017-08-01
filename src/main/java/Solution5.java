/**
 * Created by a.lebedjko on 2016.03.11..
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int studentCountWhichArrivedInTime = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++)
            {
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0)
                {
                    studentCountWhichArrivedInTime++;
                }
            }
            if (studentCountWhichArrivedInTime >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

        }

    }
}
