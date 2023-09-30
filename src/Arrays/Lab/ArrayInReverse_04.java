package Arrays.Lab;

import java.util.Scanner;

public class ArrayInReverse_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] input = kbInput.nextLine().split(" ");

        int j = input.length - 1;

        for (int i = 0; i < input.length / 2 ; i++) {

            String leftSide = input[i];
            String rightSide = input[j];

            input[i] = rightSide;
            input[j]= leftSide;

            j--;

        }
        System.out.println(String.join(" ",input));
    }
}
