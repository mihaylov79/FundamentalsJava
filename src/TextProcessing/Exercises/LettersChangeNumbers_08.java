package TextProcessing.Exercises;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] dataInput = kbInput.nextLine().split("\\s+");

        double stringSum = 0;

        for (int i = 0; i < dataInput.length; i++) {

            char[] stringLine = dataInput[i].toCharArray();
            double stringSum1;
            String strNum;
            strNum = dataInput[i];
            strNum = strNum.substring(1,strNum.length()-1);

            double num = Double.parseDouble(strNum);

            if (Character.isUpperCase(stringLine[0])){
               stringSum1 = num / (stringLine[0] - 64);
            }else{
                stringSum1 = num * (stringLine[0] - 96);
            }


            if (Character.isUpperCase(stringLine[stringLine.length - 1])){
                stringSum1 -= (stringLine[stringLine.length - 1] - 64);

            }else {
                stringSum1 += (stringLine[stringLine.length - 1] - 96);
            }
            stringSum += stringSum1;

        }

        System.out.printf("%.2f",stringSum);


    }
}
