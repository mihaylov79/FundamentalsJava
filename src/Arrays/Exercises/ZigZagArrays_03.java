package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int n = Integer.parseInt(kbInput.nextLine());


        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {

            String input = kbInput.nextLine();
            int firstNum = Integer.parseInt(input.split(" ")[0]);
            int secondNum = Integer.parseInt(input.split(" ")[1]);

            if (i % 2 == 0){
                firstArray[i] = secondNum;
                secondArray[i] = firstNum;
            }else {
                firstArray[i] = firstNum;
                secondArray[i] = secondNum;

            }
        }
        for (int numbers: secondArray) {

            System.out.print(numbers + " ");
        }
        System.out.println();

        for (int numbers:firstArray) {
            System.out.print(numbers + " ");

        }
    }

}
