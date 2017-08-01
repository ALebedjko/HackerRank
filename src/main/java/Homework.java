import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.lebedjko on 2016.09.02..
 */

public class Homework {

    public static String qq(String input, Integer min) {

        if (input.substring(min).toString().length() >= min) {
            System.out.println(input.substring(0, min) + " " + qq(input.substring(min), min));
        }
        return (input.substring(0, min) + input.substring(min));

    }

    public static void main(String[] args) {


        String someString = "abcdfgh";
        Integer min = 2;
        Integer someStringLenght = someString.length();

        Integer iterationCount = someStringLenght - min;
//        List<String> splitedByTwoCharaters = new ArrayList<>();
        List<String> resultStringArray = splitStringEvery(someString, min);

        for (String s:resultStringArray
             ) {
            System.out.print(s+",");
        }

        String allPossible[] = {
                "ab,cdfgh",
                "abc,dfgh",
                "abcd,fgh",
                "abcdf,gh",
                "ab,cd,fgh",
                "ab,cdf,gh",
                "abc,df,gh"
        };


        List<ArrayList> expectedResultList = new ArrayList<>();
//        /expectedResultList.add
    }

    public static List<String> splitStringEvery(String s, int interval) {
        List<String> resultArray = new ArrayList<>();
        int j = 0;
        int lastIndex = s.length() / interval;
        for (int i = 0; i < lastIndex; i++) {
            String nextPart = s.substring(j, j + interval);
            resultArray.add(nextPart);
            j += interval;
        } //Add the last bit
        String lastPart = s.substring(j);

        if (lastPart.length()%interval == 1) {
            resultArray.add(s.substring(j - interval));
        }
        else
        {
            resultArray.add(lastPart);
        }

        return resultArray;
    }

}