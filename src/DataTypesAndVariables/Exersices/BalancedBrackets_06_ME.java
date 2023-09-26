package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class BalancedBrackets_06_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int lines = Integer.parseInt(kbInput.nextLine());
        int left1 = 0;
        int right1 = 0;
        int bracketCount = 0;
        boolean balanced = true;

        for (int i = 0; i < lines; i++) {
            String contains = kbInput.nextLine();

            if (contains.contains("(")){
                left1++;
                bracketCount++;

                if (bracketCount % 2 == 0){
                    balanced = false;
                }
            }

            if (contains.contains(")")){
                right1++;
                bracketCount++;

                if (bracketCount % 2 != 0){
                    balanced = false;
                }
            }

        }

        if (right1 == left1 && balanced){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }

    }
}
