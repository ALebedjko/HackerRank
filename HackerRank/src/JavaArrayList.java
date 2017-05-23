import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by a.lebedjko on 2017.03.15..
 */

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Java1DArray. */
        readArraysAndPerformQueries();

    }

    public static void readArraysAndPerformQueries() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<ArrayList<String>> arrayOfArrayLists = new ArrayList<>();

            int numberOfArrays = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < numberOfArrays; i++) {
                List<String> splitLine = Arrays.asList(bufferedReader.readLine().split("\\s+"));

                ArrayList<String> arrayListOfString = new ArrayList<>();
                for (int j = 1; j < splitLine.size(); j++) {
                    arrayListOfString.add(splitLine.get(j));
                }
                arrayOfArrayLists.add(arrayListOfString);

            }

            int queryCount = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < queryCount; i++) {
                List<String> twoDimensionalIndexArray = Arrays.asList(bufferedReader.readLine().split("\\s+"));
                try {
                    int arrayIndex = Integer.parseInt(twoDimensionalIndexArray.get(0)) - 1;
                    int elementIndex = Integer.parseInt(twoDimensionalIndexArray.get(1)) - 1;
                    System.out.println(arrayOfArrayLists.get(arrayIndex).get(elementIndex));
                } catch (Exception exception) {
                    System.out.println("ERROR!");
                }
            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}