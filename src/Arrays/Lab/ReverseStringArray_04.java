package Arrays.Lab;

import java.util.Scanner;

public class ReverseStringArray_04 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        String[] input = kbInput.nextLine().split(" ");

        int j = input.length - 1;

        for (int i = 0 ; i < input.length / 2; i++){
            String leftSide = input[i];
            String rightSide = input[j];

            input[j] = leftSide;
            input [i] = rightSide;
            j ++;

        }
        System.out.println(String.join(" ", input));


    }

}
