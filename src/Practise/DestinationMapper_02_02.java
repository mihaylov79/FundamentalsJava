package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02_02 {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(=|/)(?<text>[A-Z][A-Za-z]{2,})\\1");

        Matcher matcher = pattern.matcher(kbInput.nextLine());

        int points = 0;

        List<String> testOutput = new ArrayList<>();

        while (matcher.find()){

           points += Integer.parseInt(String.valueOf(matcher.group("text").length()));

           testOutput.add(matcher.group("text"));




            //System.out.print(String.join(",",matcher.group("text")));
            System.out.println();
        }



        String destinations = testOutput.toString().replace("[","").replace("]","");

        System.out.printf("Destinations: %s",destinations);



        System.out.println();
        System.out.printf("Travel Points: %d",points);

    }
}
