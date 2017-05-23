/**
 * Created by a.lebedjko on 2016.03.11..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        Integer countOfPositiveNumbers = 0;
        Integer countOfNegativeNumber = 0;
        Integer countOfZeroes = 0;
        Integer countOfEntries = 0;

        for(int arr_i=0; arr_i < n; arr_i++) {
            if (arr[arr_i] > 0)
            {
                countOfPositiveNumbers++;
            }
            else if (arr[arr_i] < 0)
            {
                countOfNegativeNumber++;
            }
            else if (arr[arr_i] == 0)
            {
                countOfZeroes++;
            }
            countOfEntries++;
        }
        if (countOfPositiveNumbers != 0) {
            Double fractionOfPositiveNumbers = Double.parseDouble(countOfPositiveNumbers.toString()) / Double.parseDouble(countOfEntries.toString());
            System.out.println(truncateDoubleToPredefenedScale(fractionOfPositiveNumbers));
        }
        else
        {
            System.out.println(0.0);
        }

        if (countOfNegativeNumber != 0) {
            Double fractionOfNegativeNumbers = Double.parseDouble(countOfNegativeNumber.toString()) / Double.parseDouble(countOfEntries.toString());
            System.out.println(truncateDoubleToPredefenedScale(fractionOfNegativeNumbers));
        }
        else
        {
            System.out.println(0.0);
        }

        if (countOfZeroes != 0) {
            Double fractionOfZeroes = Double.parseDouble(countOfZeroes.toString()) / Double.parseDouble(countOfEntries.toString());
            System.out.println(truncateDoubleToPredefenedScale(fractionOfZeroes));
        }
        else
        {
            System.out.println(0.0);
        }
    }

    public static Double truncateDoubleToPredefenedScale(Double toBeTruncated)
    {
        Double truncatedDouble = new BigDecimal(toBeTruncated).setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
        return truncatedDouble;
    }
}
