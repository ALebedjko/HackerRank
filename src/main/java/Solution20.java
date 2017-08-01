/**
 * Created by a.lebedjko on 2016.04.01..
 */
import java.io.*;
import java.util.*;

public class Solution20 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1=input1.reverse();



        String reversedInput = new String();
        for (int i=0;i<input1.length();i++)
        {
            reversedInput += input1.charAt(i);
        }

        if (input.equals(reversedInput))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
