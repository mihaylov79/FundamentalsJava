package Methods.Exercises;

import java.util.Scanner;

public class SmallestOfThree_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int num01 = Integer.parseInt(kbInput.nextLine());
        int num02 = Integer.parseInt(kbInput.nextLine());
        int num03 = Integer.parseInt(kbInput.nextLine());

        calculateSmallestInt(num01,num02,num03);
    }
    public static void calculateSmallestInt(int num01 , int num02 , int num03) {

        if (num01 < num02 && num01 < num03) {
            System.out.println(num01);
        } else if (num02 < num01 && num02 < num03) {
            System.out.println(num02);
        }else {
            System.out.println(num03);
        }


    }
}
