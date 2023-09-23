package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int power = Integer.parseInt(kbInput.nextLine());
        int startPower = power;
        int distance = Integer.parseInt(kbInput.nextLine());
        int factor = Integer.parseInt(kbInput.nextLine());
        int pokesCounter = 0;

        while (power >= distance){
            power -= distance;
            pokesCounter++;

            if (power == (startPower / 2) && factor != 0){

                power /= factor;
            }
        }
        System.out.println(power);
        System.out.println(pokesCounter);
    }
}

