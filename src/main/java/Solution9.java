import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by a.lebedjko on 2016.03.22..
 */
public class Solution9 {

    public static void main(String[] args) throws Exception {
        //Scanner sc=new Scanner(System.in);
        //int a=sc.nextInt();
        //Complete this line
        //Complete this line
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayOfInts = new ArrayList<>();
        arrayOfInts.add(Integer.parseInt(reader.readLine()));
        arrayOfInts.add(Integer.parseInt(reader.readLine()));
        arrayOfInts.add(Integer.parseInt(reader.readLine()));

        for (int a: arrayOfInts)
            System.out.println(a);

    }
}

