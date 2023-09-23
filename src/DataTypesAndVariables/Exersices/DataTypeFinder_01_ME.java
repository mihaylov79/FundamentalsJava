package DataTypesAndVariables.Exersices;

import java.util.Scanner;

public class DataTypeFinder_01_ME {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String data = kbInput.nextLine();

        while (!"END".equalsIgnoreCase(data)) {

            if (data.matches("-?\\d+$")) {
                System.out.printf("%s is integer type%n",data);
            } else if (data.matches("-?\\d*[.]\\d+")) {
                System.out.printf("%s is floating point type%n",data);
            } else if (data.matches(".")) {
                System.out.printf("%s is character type%n",data);
            } else if ("true".equalsIgnoreCase(data) || "false".equalsIgnoreCase(data)) {
                System.out.printf("%s is boolean type%n",data);
            } else {
                System.out.printf("%s is string type%n",data);
            }
            data = kbInput.nextLine();
        }

    }
}
