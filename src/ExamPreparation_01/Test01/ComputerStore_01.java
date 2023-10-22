package ExamPreparation_01.Test01;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String prices = kbInput.nextLine();
        double sum = 0;
        double price = 0;
        double taxes = 0;
        double total = 0;

        while (!"special".equalsIgnoreCase(prices) && !"regular".equalsIgnoreCase(prices)){

            double pricesD = Double.parseDouble(prices);

            if (pricesD < 0){
                System.out.println("Invalid price!");

            }else {
                sum += pricesD;
            }

            prices = kbInput.nextLine();
        }

        if (sum == 0){
            System.out.println("Invalid order!");
            return;
        }else if ("special".equalsIgnoreCase(prices)){

            price = sum * 1.2;
            taxes = price - sum;
            total = price - price * 0.1;

            printAmount(sum,taxes,total);

        }else {

            price = sum * 1.2;
            taxes = price - sum;

            printAmount(sum,taxes,price);

        }
    }

    public static void printAmount(double sum,double taxes,double total){
        System.out.printf("Congratulations you've just bought a new computer!%n " +
                        "Price without taxes: %.2f$%n " +
                "Taxes: %.2f$%n " +
                        "-----------%n " +
                "Total price: %.2f$%n",sum,taxes,total);
    }
}
