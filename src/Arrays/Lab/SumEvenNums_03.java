package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNums_03 {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);


        int[] nums = Arrays.stream(kbInput.nextLine().split(" ")).
                mapToInt(e -> Integer.parseInt(e) ).toArray();

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0){
                sum += nums[i];
            }

        }
        System.out.println(sum);



    }
}
