package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class GameStore_03_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        String game = scan.nextLine();
        double spent = 0;

        while (!"Game Time".equalsIgnoreCase(game)){

            switch (game){
                case "OutFall 4":
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    if (budget <= 0){
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    if (budget <= 0){
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "CS: OG":
                    if (budget < 15.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 15.99;
                        spent += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    if (budget <= 0){
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "Zplinter Zell":
                    if (budget < 19.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 19.99;
                        spent += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    if (budget <= 0){
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "Honored 2":
                    if (budget < 59.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 59.99;
                        spent += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    if (budget <= 0){
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "RoverWatch":
                    if (budget < 29.99) {
                        System.out.println("Too Expensive");
                    }else {
                        budget -= 29.99;
                        spent += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    if (budget <= 0){
                        System.out.println("Out of money!");
                        return;
                    }
                    break;

                default:
                    System.out.println("Not Found");
                    break;
            }
            game = scan.nextLine();
        }
        if ("Game Time".equalsIgnoreCase(game)){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent,budget);
        }
    }
}
