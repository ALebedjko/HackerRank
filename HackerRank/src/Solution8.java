/**
 * Created by a.lebedjko on 2016.03.17..
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfTestCases = Integer.parseInt(reader.readLine().replace(" ",""));
        ArrayList<ArrayList<String>> resultList = new ArrayList<>();

        for (int i = 0; i < numberOfTestCases; i++)
        {
            ArrayList<String> resultEntry = new ArrayList<>();

            String[] inputValuesSecondLine = reader.readLine().split("\\s+");
            Integer numberOfNodes = Integer.parseInt(inputValuesSecondLine[0]);
            Integer numberOfEdges = Integer.parseInt(inputValuesSecondLine[1]);


            List<Map.Entry<Integer,Integer>> listOfEdges = new ArrayList<>();

            for (int j = 0; j < numberOfEdges; j++)
            {
                String[] inputValuesEdgeConnection = reader.readLine().split("\\s+");
                Integer startingNodeIndex = Integer.parseInt(inputValuesEdgeConnection[0]);
                Integer endingNodeIndex = Integer.parseInt(inputValuesEdgeConnection[1]);
                Map.Entry<Integer, Integer> edge = new AbstractMap.SimpleEntry<Integer, Integer>(startingNodeIndex,endingNodeIndex);
                listOfEdges.add(edge);
            }
            Integer startingPosition = Integer.parseInt(reader.readLine().replace(" ",""));
            List<Integer> listOfNodes = new ArrayList<>();
            for (int k = 1; k <= numberOfNodes; k++ )
            {
                if (!startingPosition.equals(k))
                {
                    listOfNodes.add(k);
                }
            }


            for (int l = 0; l < listOfNodes.size(); l++)
            {
                Boolean isNodeUnreachable = true;
                for (Map.Entry<Integer,Integer> entry:listOfEdges)
                {
                    if (entry.getValue() == listOfNodes.get(l) || entry.getKey() == listOfNodes.get(l))
                    {
                        isNodeUnreachable = false;
                    }
                }

                if (!isNodeUnreachable)
                {
                    
                    resultEntry.add("6");

                }
                else
                {
                    resultEntry.add("-1");
                }

            }

            resultList.add(resultEntry);


        }

        for (ArrayList<String> entry: resultList
             ) {
            String stringToPrint = "";
            for (String s: entry)
            {
                stringToPrint += s + " ";
            }
            System.out.println(stringToPrint);
        }

    }
}
