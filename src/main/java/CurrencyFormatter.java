import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by a.lebedjko on 2017.01.19..
 */
public class CurrencyFormatter {
    public static void main(String[] args) throws Exception {
        printFormattedPayment();
    }

    public static void printFormattedPayment() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(bufferedReader.readLine());

        NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usCurrencyFormatter.format(payment);

        Locale IndianLocal = new Locale("EN", "IN");
        NumberFormat IndianCurrencyFormatter = NumberFormat.getCurrencyInstance(IndianLocal);
        String india = IndianCurrencyFormatter.format(payment);

        NumberFormat chinaCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaCurrencyFormatter.format(payment);

        NumberFormat franceCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceCurrencyFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
