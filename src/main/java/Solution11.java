/**
 * Created by a.lebedjko on 2016.03.24..
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution11 {

    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer x = Integer.parseInt(reader.readLine());
        Double y = Double.parseDouble(reader.readLine());
        String s = reader.readLine();
        /*
        try {
            Integer.parseInt(input);
        } catch (Exception exp) {
            try {
                Double.parseDouble(input);
            } catch (Exception exp1) {

            }
        }
        */
        //Complete this code

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: " + x);
    }
}
