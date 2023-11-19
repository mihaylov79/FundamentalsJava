package RegEx.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int passCount = Integer.parseInt(kbInput.nextLine());

        StringBuilder group = new StringBuilder();

        Pattern pattern = Pattern.compile("_[.]+[A-Z][A-Za-z0-9]{4,}[A-Z]_[.]+");

        for (int i = 0; i < passCount; i++) {

            group.setLength(0);

            String input = kbInput.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){

                String groupStr = matcher.group();
                char[] groupChar = groupStr.toCharArray();

                for (int j = 0; j < groupChar.length; j++) {

                    if (Character.isDigit(groupChar[j])){

                        group.append(groupChar[j]);
                    }

                }if (group.isEmpty()){
                    System.out.println("Group: default");
                }else {
                    System.out.printf("Group: %s%n",group);
                }



            }else {
                System.out.println("Invalid pass!");
            }


        }
    }
}
