package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_01_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        Map<String, Stats> heroes = new LinkedHashMap<>();

        int heroesNumbers = Integer.parseInt(kbInput.nextLine());

        for (int i = 0; i < heroesNumbers; i++) {

            String input = kbInput.nextLine();
            String name = input.split(" ")[0];
            int HP = Integer.parseInt(input.split(" ")[1]);
            int MP = Integer.parseInt(input.split(" ")[2]);

            Stats heroStats = new Stats(HP,MP);
            heroes.put(name,heroStats);

        }

        String command = kbInput.nextLine();

        while (!"End".equalsIgnoreCase(command)){

            String[] commandArray = command.split(" - ");

            String commandType = commandArray[0];
            String heroName = commandArray[1];

            Stats hero = heroes.get(heroName);

            switch (commandType){
                case "CastSpell":
                    int neededMP = Integer.parseInt(commandArray[2]);
                    String spellName = commandArray[3];

                    //Stats caster = heroes.get(heroName);

                    if (hero.getMP() >= neededMP){
                        hero.setMP(hero.getMP() - neededMP);

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName,spellName,hero.getMP());
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                    }

                    break;
                case "TakeDamage":
                    int dmg = Integer.parseInt(commandArray[2]);
                    String attacker = commandArray[3];

                    if (hero.getHP() > dmg){
                        hero.setHP(hero.getHP() - dmg);

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,dmg,attacker,hero.getHP());
                    }else {
                        heroes.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                    }

                    break;
                case "Recharge":
                    int rechargeAmount = Integer.parseInt(commandArray[2]);

                    if (hero.getMP() + rechargeAmount <= 200){
                        hero.setMP(hero.getMP() + rechargeAmount);

                        System.out.printf("%s recharged for %d MP!%n",heroName,rechargeAmount);
                    }else {
                        int neededRecharge = 200 - hero.getMP();
                        hero.setMP(200);

                        System.out.printf("%s recharged for %d MP!%n",heroName,neededRecharge);
                    }

                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(commandArray[2]);

                    if (hero.getHP() + healAmount <= 100){
                        hero.setHP(hero.getHP() + healAmount);

                        System.out.printf("%s healed for %d HP!%n",heroName,healAmount);

                    }else {
                        int neededheal = 100 - hero.getHP();
                        hero.setHP(100);

                        System.out.printf("%s healed for %d HP!%n",heroName,neededheal);
                    }

                    break;
            }
            command = kbInput.nextLine();

        }

        for (Map.Entry<String, Stats>entry: heroes.entrySet()) {

            Stats hero = entry.getValue();

            System.out.printf("%s%n  HP: %d%n  MP: %d%n",entry.getKey(),hero.getHP(),hero.getMP());

        }




    }
    static class Stats{

        private int HP;
        private int MP;

        public Stats(int HP, int MP){

            this.HP = HP;
            this.MP = MP;

        }

        public int getHP() {
            return this.HP;
        }

        public int getMP() {
            return this.MP;
        }

        public void setHP(int HP) {
            this.HP = HP;

        }

        public void setMP(int MP) {
            this.MP = MP;
        }
    }
}


