package BasiSyntax.ConditionaStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String passWord = "";

        for (int i = 1; i <= userName.length(); i++) {
            char digit = userName.charAt(userName.length() - i);
            passWord += digit;
        }
        String enteredPassword = scan.nextLine();
        int enteredPassCount = 0;
        while (!enteredPassword.equals(passWord)){

            System.out.println("Incorrect password. Try again.");
            enteredPassCount++;
            if (enteredPassCount >= 3){
                System.out.printf("User %s blocked!",userName);
                return;
            }
            enteredPassword = scan.nextLine();
        }
        System.out.printf("User %s logged in.",userName);
    }
}
