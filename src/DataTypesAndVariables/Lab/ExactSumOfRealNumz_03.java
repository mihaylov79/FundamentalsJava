package DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumz_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int number = Integer.parseInt(kbInput.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < number; i++) {
            BigDecimal num = new BigDecimal(kbInput.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);

    }

}