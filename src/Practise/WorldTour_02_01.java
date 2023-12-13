package Practise;

import java.util.Scanner;

public class WorldTour_02_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String stops = kbInput.nextLine();

        String command = kbInput.nextLine();

        while (!"Travel".equalsIgnoreCase(command)) {

            String commandType = command.split(":")[0];

            StringBuilder stringManipulator ;

            switch (commandType) {

                case "Add Stop":

                    int inputIndex = Integer.parseInt(command.split(":")[1]);
                    String addString = command.split(":")[2];

                    if (isValid(inputIndex, stops)) {

                        stringManipulator = new StringBuilder(stops);

                        stops = stringManipulator.insert(inputIndex, addString).toString();

                        stringManipulator.setLength(0);
                    }
                    System.out.println(stops);
                    break;

                case "Remove Stop":

                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2]);

                    if (isValid(startIndex, stops) && isValid(endIndex, stops)) {

                        stringManipulator = new StringBuilder(stops);

                        stops = stringManipulator.replace(startIndex, endIndex + 1, "").toString();

                        stringManipulator.setLength(0);
                    }
                    System.out.println(stops);
                    break;

                case "Switch":

                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];


                    stops = stops.replace(oldString, newString);

                    System.out.println(stops);

                    break;
            }


            command = kbInput.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }


    private static boolean isValid(int index, String stops) {
        return index >= 0 && index < stops.length();

    }
}
