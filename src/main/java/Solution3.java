/**
 * Created by a.lebedjko on 2016.03.11..
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int spaceCount = 0;
        String stairHashes = "";
        for (int i = 1; i < n+1; i++)
        {
            String stairEntry = "";
            spaceCount = n -i;
            stairHashes += "#";
            String stairSpaces = "";

            for (int j = 0; j < spaceCount; j++)
            {
                stairSpaces += " ";
            }


            stairEntry += stairSpaces + stairHashes;
            System.out.println(stairEntry);

        }
    }
}
