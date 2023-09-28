package Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverse_02 {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        int n = Integer.parseInt(kbInput.nextLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int nextNum = Integer.parseInt(kbInput.nextLine());
            nums[i] = nextNum;

        }

        for (int i = (nums.length - 1); i >= 0 ; i--) {

            System.out.print(nums[i] + " ");
        }










    }
}
