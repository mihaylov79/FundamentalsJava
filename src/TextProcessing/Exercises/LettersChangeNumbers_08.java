package TextProcessing.Exercises;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] dataInput = kbInput.nextLine().split("\\s+");

        double stringSum = 0;

        for (int i = 0; i < dataInput.length; i++) {

            char[] stringLine = dataInput[i].toCharArray();
            double stringSum1 = 0.0;
            String strNum;
            boolean isSingleDigit = true;
            if(Character.isDigit(stringLine[2])){
                strNum = String.valueOf(stringLine[1]) + String.valueOf(stringLine[2]);
                isSingleDigit = false;
            }else {
                strNum = String.valueOf(stringLine[1]);
            }

            double num = Double.parseDouble(strNum);

            if (Character.isUpperCase(stringLine[0])){
               stringSum1 = num / (stringLine[0] - 64);
            }else{
                stringSum1 = num * (stringLine[0] - 96);
            }

            int idx;
            if (!isSingleDigit){
                idx = 3;
            }else {
                idx = 2;
            }

            if (Character.isUpperCase(stringLine[idx])){
                stringSum1 -= (stringLine[idx] - 64);

            }else {
                stringSum1 += (stringLine[idx] - 96);
            }
            stringSum += stringSum1;

        }

        System.out.printf("%.2f",stringSum);


    }
}
