package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Pounds2Dollars_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        double pounds = Double.parseDouble(kbInput.nextLine());

        double dollars = pounds * 1.36;

        System.out.printf("%.3f",dollars);


    }
}
