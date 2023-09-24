package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class FromLeft2Right_rev02_02_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int cycles = Integer.parseInt(kbInput.nextLine());

        for (int i = 0; i < cycles; i++) {

            long sum = 0;

            String data = kbInput.nextLine();

            String[] parts = data.split(" ");
            long leftNum = Long.parseLong(parts[0]);
            long rightNum = Long.parseLong(parts[1]);

            if (leftNum > rightNum){

                while (!(leftNum == 0)){

                    sum += leftNum % 10;
                    leftNum /= 10;
                }
                System.out.println(Math.abs(sum));
            }else {
                while (!(rightNum == 0)){

                    sum += rightNum % 10;
                    rightNum /= 10;
                }
                System.out.println(Math.abs(sum));
            }

        }

    }
}
