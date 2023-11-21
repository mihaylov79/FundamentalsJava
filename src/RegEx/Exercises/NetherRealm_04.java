package RegEx.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealm_04 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] demonsNames = kbInput.nextLine().split(" *, *");


        for (int i = 0; i < demonsNames.length; i++) {

            String demon = demonsNames[i];
            int health = getHealth(demon);

            double attack = getAttack(demon);

            System.out.printf("%s - %d health, %.2f damage%n",demon,health,attack);

        }

    }

    private static double getAttack(String demon) {
        double attack = 0;
        Pattern pattern = Pattern.compile("[-]?\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(demon);
        while (matcher.find()){
            attack += Double.parseDouble(matcher.group());
        }
        for (char symbol: demon.toCharArray()) {
            if (symbol == '*'){
                attack *= 2;
            }
            if(symbol == '/'){
                attack /= 2;
            }
        }
        return attack;
    }

    private static int getHealth(String demon){
        int health = 0;
        Pattern pattern = Pattern.compile("[^+\\-*/.0-9]");
        Matcher matcher = pattern.matcher(demon);
        while (matcher.find()){
            char[] demonCharArray = matcher.group().toCharArray();
            for (char dchar:demonCharArray) {
                health += dchar;
            }
        }
        return health;
    }
}
