package FinalExamPreparation;

import java.util.Scanner;

public class SecretChat_03_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        String command = kbInput.nextLine();

        StringBuilder inputBuilder;

        while (!"Reveal".equalsIgnoreCase(command)){

            String commandType = command.split(":\\|:")[0];


            switch (commandType){

                case "InsertSpace":
                    int index = Integer.parseInt(command.split(":\\|:")[1]);

                    inputBuilder = new StringBuilder(input);

                    inputBuilder.insert(index," ");

                    input = inputBuilder.toString();
                    inputBuilder.setLength(0);

                    System.out.println(input);

                    break;

                case "Reverse":
                    String sString = command.split(":\\|:")[1];

                    if (input.contains(sString)){

                        int firstIndex = input.indexOf(sString);

                        inputBuilder = new StringBuilder(input);
                        inputBuilder.replace(firstIndex,firstIndex + sString.length(),"");
                        input = inputBuilder.toString();
                        inputBuilder.setLength(0);

                        inputBuilder = new StringBuilder(sString);
                        inputBuilder.reverse();
                        sString = inputBuilder.toString();
                        inputBuilder.setLength(0);

                        inputBuilder = new StringBuilder(input);
                        inputBuilder.append(sString);
                        input = inputBuilder.toString();
                        inputBuilder.setLength(0);

                        System.out.println(input);

                    }else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String searchedText = command.split(":\\|:")[1];
                    String replacement = command.split(":\\|:")[2];

                    input = input.replace(searchedText,replacement);

                    System.out.println(input);

                    break;
            }

            command = kbInput.nextLine();

        }
        System.out.printf("You have a new text message: %s",input);
    }
}
