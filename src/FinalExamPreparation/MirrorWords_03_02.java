package FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_03_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        int validCount = 0;
        StringBuilder reverser;

        Map<String,String> mirrorWords = new LinkedHashMap<>();


        String input = kbInput.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            validCount++;
            reverser = new StringBuilder(matcher.group("word1"));
            reverser.reverse();
            String reverserString = reverser.toString();

            if (reverserString.equals(matcher.group("word2"))){

                mirrorWords.put(matcher.group("word1"), matcher.group("word2"));

            }

        }
        List<String>output = new ArrayList<>();

        for (Map.Entry word: mirrorWords.entrySet()) {

            String pair = String.format("%s <=> %s",word.getKey(),word.getValue());

            output.add(pair);
        }
        String finalOutput = output.toString();

        if (validCount > 0){
            System.out.printf("%d word pairs found!%n",validCount);
        }else {
            System.out.println("No word pairs found!");
        }

        if (mirrorWords.size() > 0){

            System.out.println("The mirror words are:");
            System.out.println(finalOutput.replace("[","").replace("]",""));


        }else {
            System.out.println("No mirror words!");
        }


    }
}
