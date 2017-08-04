package big_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerChallenge {

    public static void main(String[] args) throws IOException {
        readInputAndPerformBothMethods();
    }

    public static void readInputAndPerformBothMethods() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger firstNumber = new BigInteger(bufferedReader.readLine());
        BigInteger secondNumber =  new BigInteger(bufferedReader.readLine());
        printAdditionOfNumbers(firstNumber, secondNumber);
        printMultiplicationOfNumbers(firstNumber, secondNumber);
    }

    public static void printAdditionOfNumbers(BigInteger firstNumber, BigInteger secondNumber) {
        System.out.println(firstNumber.add(secondNumber));
    }

    public static void printMultiplicationOfNumbers(BigInteger firstNumber, BigInteger secondNumber) {
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
