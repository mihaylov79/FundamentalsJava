package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int orders = Integer.parseInt(scan.nextLine());
        double total =  0;

        for (int i = 1; i <=orders ; i++) {
            double pricePerCapusle = Double.parseDouble(scan.nextLine());
            int daysInMonth = Integer.parseInt(scan.nextLine());
            int capsuCount = Integer.parseInt(scan.nextLine());

            double order = daysInMonth * capsuCount * pricePerCapusle;
            System.out.printf("The price for the coffee is: $%.2f%n",order);
            total += order;

        }
        System.out.printf("Total: $%.2f",total);
    }
}
