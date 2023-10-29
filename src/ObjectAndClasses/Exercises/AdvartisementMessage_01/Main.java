package ObjectAndClasses.Exercises.AdvartisementMessage_01;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int n = Integer.parseInt(kbInput.nextLine());

        Advertisement message = new Advertisement();

        for (int i = 0; i < n ; i++) {
            String advMsg = message.randomMessage();
            System.out.println(advMsg);
        }




    }
}
