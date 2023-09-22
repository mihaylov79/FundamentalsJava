package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int lines = Integer.parseInt(kbInput.nextLine());

        double volumeMAX = Integer.MIN_VALUE;
        String modelMAX = "";

        for (int i = 0; i < lines; i++) {

            String model = kbInput.nextLine();
            double radius = Double.parseDouble(kbInput.nextLine());
            int height = Integer.parseInt(kbInput.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;

            if (volume > volumeMAX){
                volumeMAX = volume;
                modelMAX = model;
            }
        }
        System.out.println(modelMAX);
    }
}
