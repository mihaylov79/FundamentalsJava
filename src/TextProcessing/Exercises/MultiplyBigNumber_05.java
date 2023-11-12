package TextProcessing.Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(kbInput.nextLine());
        BigInteger secondNumber = new BigInteger(kbInput.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
