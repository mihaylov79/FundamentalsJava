package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int factorielSum = 0;
        int startNumber = number;

       while (number > 0 ){
           int digit = number % 10;
           number = number / 10;
           int factoriel = 1;
           for (int i = 1; i <=digit ; i++) {
               factoriel *= i;
           }
           factorielSum += factoriel;
       }
       if (factorielSum == startNumber){
           System.out.println("yes");
       }else {
           System.out.println("no");
       }


    }
}
