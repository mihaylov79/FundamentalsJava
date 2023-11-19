package RegEx.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner kbInput =  new Scanner(System.in);

        int messageCount = Integer.parseInt(kbInput.nextLine());

        StringBuilder output = new StringBuilder();

        List<String> A = new ArrayList<>();
        List<String> D = new ArrayList<>();
        int attackCount = 0;
        int destroyCount = 0;



        for (int i = 0; i < messageCount; i++) {
            output.setLength(0);

            Pattern pattern = Pattern.compile("[STARstar]");

            String messageInput = kbInput.nextLine();

            Matcher matcher = pattern.matcher(messageInput);
            String keyStr="";

            while (matcher.find()){
                keyStr += matcher.group();

            }

            int key = keyStr.length();

            char[] messageArray = messageInput.toCharArray();

            for (int j = 0; j < messageArray.length; j++) {

                char currentChar = (char) (messageArray[j] - key);

                output.append(currentChar);

            }


            Pattern pattern1 = Pattern.compile("@(?<planet>[A-Za-z]+)\\d?[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<command>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)");
            Matcher matcher1 = pattern1.matcher(output);

            if (matcher1.find()){
                if (matcher1.group("command").equalsIgnoreCase("A")){
                    A.add(matcher1.group("planet"));
                    attackCount++;
                }else {
                    D.add(matcher1.group("planet"));
                    destroyCount++;
                }


            }

        }

        Collections.sort(A);
        Collections.sort(D);

        System.out.printf("Attacked planets: %d%n",attackCount);
        for (String planets: A) {

            System.out.printf("-> %s%n",planets);
        }
        System.out.printf("Destroyed planets: %d%n",destroyCount);
        for (String planets: D) {

            System.out.printf("-> %s%n",planets);

        }



    }
}
