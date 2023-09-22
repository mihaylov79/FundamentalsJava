package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        int lines = Integer.parseInt(kbInput.nextLine());

        int tankCapacity = 255;
        int storedWater = 0;

        for (int i = 0; i < lines; i++) {

            int waterLt = Integer.parseInt(kbInput.nextLine());
            if (waterLt > tankCapacity - storedWater){
                System.out.println("Insufficient capacity!");
            }else {
                storedWater += waterLt;
            }
        }
        System.out.println(storedWater);




    }
}
