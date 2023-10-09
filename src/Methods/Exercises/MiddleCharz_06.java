package Methods.Exercises;

import java.util.Scanner;

public class MiddleCharz_06 {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        if (input.length() % 2 == 0){
            String midCharResult = calculateEvenChar(input);
            System.out.println(midCharResult);

        }else {

            String midChar = calculateOddChar(input);
            System.out.println(midChar);
        }

    }

    public static String calculateEvenChar(String input){

        int firstPosition = (input.length() / 2) - 1;
        String firstChar = String.valueOf(input.charAt(firstPosition));
        String secondChar = String.valueOf(input.charAt(firstPosition + 1));

        return String.format("%s%s",firstChar,secondChar);
    }

    public static String calculateOddChar(String input){

        return String.valueOf(input.charAt(input.length() / 2));
    }


}
