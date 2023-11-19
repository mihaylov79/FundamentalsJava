package RegEx.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<email>[ ]?[A-Za-z]+[.,-_]*[A-Za-z]*@[a-z]+(\\.*-*[a-z]*)*)\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
