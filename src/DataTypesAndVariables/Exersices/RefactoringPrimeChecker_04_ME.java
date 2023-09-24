package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class RefactoringPrimeChecker_04_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int number = Integer.parseInt(kbInput.nextLine());

        for (int prime = 2; prime <=number ; prime++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < prime; divisor++) {

                if (prime % divisor == 0 ){
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n",prime, isPrime);

        }
    }
}
