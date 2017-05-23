/**
 * Created by a.lebedjko on 2016.03.26..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution15 {

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resultSet = new ArrayList<>();
        while (true)
        {
            String s = sc.nextLine();
            if (s.equals(""))
            {
                System.out.println("+");
                break;
            }
            resultSet.add(s);
        }


        for (int i = 0; i < resultSet.size();i++)
        {
            System.out.println(i+1 + " " + resultSet.get(i));
        }

    }
}
