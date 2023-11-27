package FinalExamPreparation;

import java.util.Scanner;

public class ActivationKey_02_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        String command = kbInput.nextLine();

        StringBuilder passBuilder;


        while (!"Generate".equalsIgnoreCase(command)){

            String commandType = command.split(">>>")[0];


            switch (commandType){

                case "Contains":
                    String sString = command.split(">>>")[1];

                    if (input.contains(sString)){
                        System.out.printf("%s contains %s%n",input,sString);
                    }else {
                        System.out.println("Substring not found!");
                    }

                    break;

                case "Flip":
                    String flipType = command.split(">>>")[1];
                    int startIndex = Integer.parseInt(command.split(">>>")[2]);
                    int endIndex = Integer.parseInt(command.split(">>>")[3]);

                    passBuilder =  new StringBuilder(input);

                    String flippedString = input.substring(startIndex,endIndex);

                    if (flipType.equalsIgnoreCase("Upper")){

                        flippedString = flippedString.toUpperCase();
                    }else {
                        flippedString = flippedString.toLowerCase();
                    }

                    passBuilder.replace(startIndex,endIndex,flippedString);

                    input = passBuilder.toString();

                    passBuilder.setLength(0);

                    System.out.printf("%s%n",input);

                    break;

                case "Slice":
                    int start = Integer.parseInt(command.split(">>>")[1]);
                    int end = Integer.parseInt(command.split(">>>")[2]);

                    passBuilder = new StringBuilder(input);

                    passBuilder.replace(start,end,"");

                    input = passBuilder.toString();

                    passBuilder.setLength(0);

                    System.out.printf("%s%n",input);

                    break;
            }

            command = kbInput.nextLine();

        }
        System.out.printf("Your activation key is: %s",input);
    }
}
