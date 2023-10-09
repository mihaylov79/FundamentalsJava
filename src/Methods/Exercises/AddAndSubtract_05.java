package Methods.Exercises;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int num1 = Integer.parseInt(kbInput.nextLine());
        int num2 = Integer.parseInt(kbInput.nextLine());
        int num3 = Integer.parseInt(kbInput.nextLine());

        int sum = sumOf2(num1,num2);
        int subtract = subtractWith3(sum , num3);

        System.out.println(subtract);



    }

    public static int sumOf2(int num1 , int num2){

        int sum = num1 + num2;

        return sum;
    }

    public static int subtractWith3 (int sum , int num3 ){

        int subtract = sum - num3;

        return subtract;
    }
}
