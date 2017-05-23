import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by a.lebedjko on 2017.01.27..
 */
public class JavaRegex2DuplicateWords {

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numSentences= Integer.parseInt(bufferedReader.readLine());

        while (numSentences-- > 0) {
            String input = bufferedReader.readLine();
            // Prints the modified sentence.
            System.out.println(removeDup(input));
        }

        bufferedReader.close();
    }

    public static String removeDup(String s){
        List<String> list = Arrays.asList(s.split("\\s"));
        Set<String> sortedSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        List<String> orderedList = new ArrayList<String>();
        for(String str : list){
            if(sortedSet.add(str)){ // add returns true, if it is not present already else false
                orderedList.add(str);
            }
        }

        return orderedList.toString().replace(", ", " ").replaceAll("\\[|\\]", "").trim();
    }
}

