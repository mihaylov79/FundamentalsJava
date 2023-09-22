package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        byte snowballCount = Byte.parseByte(kbInput.nextLine());

        double bestValue = Double.MIN_VALUE;
        String result = "";

        for (byte i = 0; i < snowballCount; i++) {

             short snowballSnow = Short.parseShort(kbInput.nextLine());
             short snowballTime = Short.parseShort(kbInput.nextLine());
             byte snowballQuality = Byte.parseByte(kbInput.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime) , snowballQuality);

            if (snowballValue > bestValue){
                bestValue = snowballValue;
                result = String.format("%d : %d = %.0f (%d)",snowballSnow ,snowballTime,snowballValue, snowballQuality);
            }

        }

        System.out.println(result);

    }
}
