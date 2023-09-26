package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(kbInput.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(kbInput.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(kbInput.nextLine());

        System.out.printf("Pyramid Volume: %.2f", (length * width * height) / 3);
    }
}
