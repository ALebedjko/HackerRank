package advanced;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JavaMD5 {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        readInputStringAndComputeHash();
    }

    public static void readInputStringAndComputeHash() throws IOException, NoSuchAlgorithmException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(inputString.getBytes());
        byte[] digest = messageDigest.digest();

        String hashValue = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.print(hashValue);
    }


}
