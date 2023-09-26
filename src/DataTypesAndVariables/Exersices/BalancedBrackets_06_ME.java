package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class BalancedBrackets_06_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int lines = Integer.parseInt(kbInput.nextLine());
        int left1 = 0;
        int right1 = 0;

        for (int i = 0; i < lines; i++) {

            char contains = kbInput.nextLine().charAt(0);

            if (contains == '('){
                left1++;
            }
            if (contains == ')'){
                right1++;
            }
        }
        if (right1 == left1){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
