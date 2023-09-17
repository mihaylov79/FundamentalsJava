package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import javax.xml.stream.events.StartDocument;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double credit = 0;

        while (!"Start".equalsIgnoreCase(input)){

            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                credit += coin;
                input = scan.nextLine();
            }else {
                System.out.printf("Cannot accept %.2f%n",coin);
                input = scan.nextLine();
            }
        }
        if ("Start".equalsIgnoreCase(input)){
            input = scan.nextLine();
        }

        while (!"End".equalsIgnoreCase(input)){
            String product = input;

            switch (product){
                case "Nuts":
                    if (credit < 2 ){
                        System.out.println("Sorry, not enough money");
                        //continue;
                    }else {
                        credit -= 2;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    if (credit < 0.7 ){
                        System.out.println("Sorry, not enough money");
                        //continue;
                    } else {
                        credit -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    if (credit < 1.5 ){
                        System.out.println("Sorry, not enough money");
                        //continue;
                    } else {
                        credit -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    if (credit < 0.8 ){
                        System.out.println("Sorry, not enough money");
                        //continue;
                    } else {
                        credit -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    if (credit < 1 ){
                        System.out.println("Sorry, not enough money");
                        //continue;
                    } else {
                        credit -= 1;
                        System.out.println("Purchased Coke");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input = scan.nextLine();
        }

        System.out.printf("Change: %.2f",credit);

    }
}
