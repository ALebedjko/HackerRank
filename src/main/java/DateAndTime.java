import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by a.lebedjko on 2017.01.18..
 */
public class DateAndTime {
    public static final String whitespace = " ";

    public static void printDayNameByDate() throws IOException, ParseException, Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] splitedDateString = reader.readLine().split("\\s+");

        if (splitedDateString != null && splitedDateString.length == 3) {
            int year = Integer.parseInt(splitedDateString[2]);
            if (year > 2000 && year < 3000) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(splitedDateString[0]);
                stringBuilder.append(whitespace);
                stringBuilder.append(splitedDateString[1]);
                stringBuilder.append(whitespace);
                stringBuilder.append(splitedDateString[2]);

                String dateString = stringBuilder.toString();
                Date date = new SimpleDateFormat("MM dd yyyy").parse(dateString);
                System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date).toUpperCase());
            }
        } else {
            throw new Exception("Invalid input");
        }

    }

    public static void main(String[] args) throws Exception {
        printDayNameByDate();
    }
}
