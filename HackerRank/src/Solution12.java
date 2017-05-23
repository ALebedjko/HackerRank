/**
 * Created by a.lebedjko on 2016.03.24..
 */
import java.util.Scanner;

public class Solution12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            Integer x=sc.nextInt();
            String inputString = x.toString();
            String outputString = "";
            if (inputString.length()<3)
            {
                Integer paddedIntLength = 3 - inputString.length();
                outputString = "";
                for (int j = 0; j < paddedIntLength; j++)
                    outputString += "0";
            }
            outputString += x;
            System.out.printf("%-15s"+"%3s%n",s1,outputString);
            //Complete this line
        }
        System.out.println("================================");

    }
}
