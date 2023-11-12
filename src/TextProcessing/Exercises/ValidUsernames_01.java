package TextProcessing.Exercises;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] usernames = kbInput.nextLine().split(", ");

        for (int i = 0; i < usernames.length; i++) {

            String username = usernames[i];
            if (isValid(username)){
                System.out.println(username);

            }

        }
    }

    public static boolean isValid(String username){
        boolean validLength = username.length() >=3 && username.length() <= 16;
        boolean validChars= true;


        if (validLength){
            for (char symbol:username.toCharArray()) {
                if (!Character.isLetterOrDigit(symbol) && symbol !='-' && symbol != '_'){
                    validChars = false;
                    break;
                }
            }

        }
        return validLength && validChars;

    }
}
