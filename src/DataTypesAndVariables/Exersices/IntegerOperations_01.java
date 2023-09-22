package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner kbinput = new Scanner(System.in);

        int firstInt = Integer.parseInt(kbinput.nextLine());
        int secondInt = Integer.parseInt(kbinput.nextLine());
        int thirdInt = Integer.parseInt(kbinput.nextLine());
        int forthInt = Integer.parseInt(kbinput.nextLine());

        int result = ((firstInt + secondInt) / thirdInt) * forthInt;

        System.out.println(result);

    }
}
