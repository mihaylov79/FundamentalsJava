package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset_01_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String stringInput = kbInput.nextLine();

        String commandInput = kbInput.nextLine();

        StringBuilder output = new StringBuilder(stringInput);

        while (!"Done".equalsIgnoreCase(commandInput)){


            String command = commandInput.split(" ")[0];

            switch (command){
                case "TakeOdd":
                    String outputTemp = output.toString();
                    char[] outputCharArr = outputTemp.toCharArray();
                    output.setLength(0);

                    for (int i = 1; i < outputCharArr.length; i++) {

                        if (i % 2 != 0){
                            output.append(outputCharArr[i]);
                        }

                    }
                    System.out.println(output);

                    break;
                case "Cut":
                    int Index = Integer.parseInt(commandInput.split(" ")[1]);
                    int length = Integer.parseInt(commandInput.split(" ")[2]);

                    output.replace(Index,Index + length, "");

                    System.out.println(output);

                    break;
                case "Substitute":
                    String substr = commandInput.split(" ")[1];
                    String subst = commandInput.split(" ")[2];

                    String outputStr = output.toString();
                    if (outputStr.contains(substr)){
                        String tempOutput = outputStr.replace(substr,subst);

                        output.setLength(0);
                        output.append(tempOutput);

                        System.out.println(output);
                    }else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            commandInput = kbInput.nextLine();
        }

        System.out.printf("Your password is: %s",output);

    }
}
