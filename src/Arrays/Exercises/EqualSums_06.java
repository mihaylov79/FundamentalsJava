package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int[] array = Arrays.stream(kbInput.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int leftSum ;
        int rightSum ;
        boolean found = false;
        int position = 0;

        for (int i = 0; i < array.length; i++) {

            leftSum = 0;
            rightSum = 0;
            for (int j = i + 1; j <= array.length - 1 ; j++) {

                rightSum += array[j];

            }
            for (int k = i; k >= 1 ; k--) {

                leftSum += array[k - 1];

            }
            if (rightSum == leftSum){
                found = true;
                position = i;
                break;
            }

        }
        if (found) {
            System.out.println(position);
        }else {
            System.out.println("no");
        }

    }
}
