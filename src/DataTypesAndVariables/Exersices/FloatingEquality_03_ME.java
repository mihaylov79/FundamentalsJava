package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class FloatingEquality_03_ME {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        double a = Double.parseDouble(kbInput.nextLine());
        double b = Double.parseDouble(kbInput.nextLine());

        if (a > b){
            if (a - b <= 0.000001) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        } else if (b > a) {
            if (b - a <= 0.000001) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }


    }
}
