package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class BalancedBrackets_06_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int lines = Integer.parseInt(kbInput.nextLine());
        int left1 = 0;
        int right1 = 0;
        boolean balanced = true;

        for (int i = 0; i < lines; i++) {
            char contains = kbInput.nextLine().charAt(0);

            if (contains == '('){
                left1++;
            }
            if (contains == ')'){
                right1++;
            }
            if (left1 > right1 && left1 - right1 > 1 ||right1 > left1 && right1 - left1 > 1){
                balanced = false;
            }
        }
        if (right1 == left1 && balanced){
            System.out.println("BALANCED");
        }
        if (right1 != left1 ){
            System.out.println("UNBALANCED");
        }
        //if (balanced){
            //System.out.println("BALANCED");
        //}else {
            //System.out.println("UNBALANCED");
        //}
    }
}
