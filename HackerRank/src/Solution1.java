/**
 * Created by a.lebedjko on 2016.03.11..
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                if (a_i == a_j)
                {
                    primaryDiagonalSum += a[a_i][a_j];
                }
                if (a_i == n-1-a_j)
                {
                    secondaryDiagonalSum += a[a_i][a_j];
                }

            }
            }
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
        }

    }

