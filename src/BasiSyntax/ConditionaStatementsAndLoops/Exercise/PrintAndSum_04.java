package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scan.nextLine());
        int lastDigit = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = firstDigit; i <= lastDigit ; i++) {
            sum += i;
            System.out.print(i +" ");
        }
        System.out.printf("%nSum: %d",sum);
    }
}
