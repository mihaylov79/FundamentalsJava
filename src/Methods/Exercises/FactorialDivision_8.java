package Methods.Exercises;

import java.util.Scanner;

public class FactorialDivision_8 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int firstDigit = Integer.parseInt(kbInput.nextLine());
        int secondDigit = Integer.parseInt(kbInput.nextLine());


        long factorial1 = calculateFactorial(firstDigit);
        long factorial2 = calculateFactorial(secondDigit);

        System.out.printf("%.2f", factorial1 * 1.0/factorial2);
    }

    public static long calculateFactorial(int digit){

        long factorial = 1;

        for (int i = 1; i <= digit ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
