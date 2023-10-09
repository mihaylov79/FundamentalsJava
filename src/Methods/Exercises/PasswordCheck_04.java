package Methods.Exercises;

import java.util.Scanner;

public class PasswordCheck_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] password = kbInput.nextLine().split("");

        passCheck(password);


    }

    public static void passCheck (String[] password){
        int letterCount = 0;
        int digitCount = 0;
        int charsCount = 0;

        for (int i = 0; i < password.length; i++) {
            if (password[i].matches("[A-Za-z]" )){
                letterCount ++;

            }
            if (password[i].matches("[0-9]")) {
                digitCount++;
            }
            if (!password[i].matches("[a-zA-Z0-9]")){
                charsCount++;
            }
        }
        if (letterCount + digitCount <=10 && letterCount + digitCount >= 6 && charsCount == 0){
            System.out.println("Password is valid");
        }
        if(letterCount + digitCount + charsCount > 10 || letterCount + digitCount + charsCount < 6){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (charsCount > 0) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            
        }

    }
}
