package Fundamentals_FinalExam_03_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int cmdCount = Integer.parseInt(kbInput.nextLine());

        Pattern pattern = Pattern.compile("(!)(?<command>[A-Z][a-z]{2,})\\1:\\[(?<text>[A-Za-z]{8,})]");

        for (int i = 0; i < cmdCount; i++) {

            String commandInput = kbInput.nextLine();

            Matcher matcher = pattern.matcher(commandInput);

            if (matcher.find()){

                StringBuilder decoded = new StringBuilder();
                decoded.setLength(0);

                String command = matcher.group("command");
                String message = matcher.group("text");

                char[]messageArr = message.toCharArray();

                for (int j = 0; j < messageArr.length; j++) {

                    decoded.append(" " + (int)messageArr[j]);

                }

                System.out.println(command +":"+decoded);


            }else {
                System.out.println("The message is invalid");
            }



        }


    }
}
