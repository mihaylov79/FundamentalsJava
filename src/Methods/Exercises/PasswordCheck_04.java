package Methods.Exercises;

import java.util.Scanner;

public class PasswordCheck_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] password = kbInput.nextLine().split("");

        passCheck(password);


    }

    public static void passCheck (String[] password){

        int digitCount = 0;
        int charsCount = 0;
        boolean isValidLength ;
        boolean isValidContent = true;
        boolean isValidDigits = false;

        for (int i = 0; i < password.length; i++) {

            if (password[i].matches("[0-9]")) {
                digitCount++;
            }
            if (!password[i].matches("[a-zA-Z0-9]")){
                charsCount++;

            }
        }

        if(password.length >= 6 && password.length <= 10){
            isValidLength = true;
        }else {
            isValidLength = false;
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (charsCount > 0) {
            isValidContent = false;
            System.out.println("Password must consist only of letters and digits");
        }

        if (digitCount >= 2) {
            isValidDigits = true;

        }else {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidContent && isValidLength && isValidDigits){
            System.out.println("Password is valid");
        }
    }
}
