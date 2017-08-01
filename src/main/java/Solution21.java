/**
 * Created by a.lebedjko on 2016.04.01..
 */
import java.io.*;
import java.util.*;

public class Solution21 {

    static HashMap<String,Integer> getFrequencyMap(String inputString)
    {
        HashMap<String,Integer> frequencyMap = new HashMap<>();
        inputString = inputString.toLowerCase();

        int l = inputString.length();
        char ch;
        int count = 0;
        for (Character i = 'a'; i<='z';i++)
        {
            count = 0;
            for (int j = 0; j< l; j++)
            {
                ch = inputString.charAt(j);
                if (ch==i)
                {
                    count++;
                }
                if (count!= 0)
                {
                    frequencyMap.put(i.toString(),count);
                }
            }
        }

        return frequencyMap;
    }

    static boolean isAnagram(String A, String B) {

        /*
        HashMap<String,Integer> firstStringFrequencyMap = new HashMap<>();
        firstStringFrequencyMap = getFrequencyMap(A);

        for (Map.Entry<String, Integer> entry: firstStringFrequencyMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("");

        HashMap<String,Integer> secondStringFrequencyMap = new HashMap<>();
        secondStringFrequencyMap = getFrequencyMap(B);

        for (Map.Entry<String, Integer> entry: secondStringFrequencyMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        */


        if (getFrequencyMap(A).equals(getFrequencyMap(B)))
        {
            return true;
        }
        else
        {
            return false;
        }
        //Complete the function

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}