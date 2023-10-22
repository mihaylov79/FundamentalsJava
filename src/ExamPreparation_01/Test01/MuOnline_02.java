package ExamPreparation_01.Test01;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] input = kbInput.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i < input.length; i++) {

            String[] command = input[i].split(" ");
            String commandType = command[0];

            switch (commandType){
                case "potion":
                    int healthBeforePot = health;
                    int healthPow = Integer.parseInt(command[1]);
                    health = Math.min(health + healthPow, 100);

                    System.out.printf("You healed for %d hp.%n",health - healthBeforePot );
                    System.out.printf("Current health: %d hp.%n",health);

                    break;

                case "chest":
                    bitcoins += Integer.parseInt(command[1]);

                    System.out.printf("You found %d bitcoins.%n",Integer.parseInt(command[1]));

                    break;
                default:
                    health -= Integer.parseInt(command[1]);
                    if (health <= 0){
                        System.out.printf("You died! Killed by %s.%n",commandType);
                        System.out.printf("Best room: %d",i+1);
                        return;
                    }else {
                        System.out.printf("You slayed %s.%n",commandType);
                    }
            }

        }
        if (health > 0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitcoins);
            System.out.printf("Health: %d",health);
        }
    }

}
