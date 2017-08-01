import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by a.lebedjko on 17.04.2017.
 */


class RegexIPMatcher {
    public static void main(String[] args) {
        checkIfValidIpAddress();
    }

    protected static void checkIfValidIpAddress(){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    private static class MyRegex {
        String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    }
}