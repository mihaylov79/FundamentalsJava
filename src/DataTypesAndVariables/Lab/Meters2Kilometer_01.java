package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Meters2Kilometer_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int meters = Integer.parseInt(kbInput.nextLine());

        double kilometers = meters / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}
