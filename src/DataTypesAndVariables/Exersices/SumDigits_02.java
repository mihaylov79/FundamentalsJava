package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner kbinput = new Scanner(System.in);

        int number = Integer.parseInt(kbinput.nextLine());
        int sum = 0;
        while (number > 0){

            int digit = number % 10;
            number = number / 10;

            sum += digit;
        }
        System.out.println(sum);
    }
}
