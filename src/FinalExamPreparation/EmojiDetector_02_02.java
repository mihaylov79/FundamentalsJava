package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        String emojiRegex = "(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1";
        String numRegex = "(?<num>[0-9])";

        Map<String, Integer> coolEmojis = new LinkedHashMap<>();

        int coolTreshold = 1;

        Pattern pattern = Pattern.compile(numRegex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){

            coolTreshold *= Integer.parseInt(matcher.group("num"));

        }

        pattern = Pattern.compile(emojiRegex);
        matcher = pattern.matcher(input);

        while (matcher.find()){
            int coolness = 0;
           // char[] currentEmoji = matcher.group("emoji").toCharArray();

            for (char entry: matcher.group("emoji").toCharArray()) {

                coolness += entry;

            }

           // if (coolness > coolTreshold){

                coolEmojis.put(matcher.group(),coolness );
            //}


        }


        System.out.printf("Cool threshold: %d%n",coolTreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",coolEmojis.size());
        for (Map.Entry<String, Integer>entry: coolEmojis.entrySet()) {

            if (entry.getValue() > coolTreshold){
                System.out.printf("%s%n",entry.getKey());
            }


        }




    }
}
