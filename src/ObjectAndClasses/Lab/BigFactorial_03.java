package ObjectAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int n = Integer.parseInt(kbInput.nextLine());

        BigInteger factorial = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));

        }

        System.out.println(factorial);
    }
}
