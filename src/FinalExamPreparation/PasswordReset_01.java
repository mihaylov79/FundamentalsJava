package FinalExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String stringInput = kbInput.nextLine();

        String commandInput = kbInput.nextLine();

        StringBuilder output = new StringBuilder(stringInput);

        while (!"Done".equalsIgnoreCase(commandInput)){


            String command = commandInput.split(" ")[0];

            switch (command){
                case "TakeOdd":

                    for (int i = 0; i < output.length(); i++) {

                        if (output.charAt(i) != 0){
                            output.replace(i,i, "");
                        }

                    }

                    break;
                case "Cut":
                    
                    break;
                case "Substitute":
                    
                    break;
            }








        }


    }
}
