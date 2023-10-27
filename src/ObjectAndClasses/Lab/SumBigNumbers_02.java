package ObjectAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        BigInteger num1 = new BigInteger(kbInput.nextLine());
        BigInteger num2 = new BigInteger(kbInput.nextLine());

        BigInteger sum = num1.add(num2);

        System.out.println(sum);
    }
}
