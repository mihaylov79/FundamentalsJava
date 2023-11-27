package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_02_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String cities = kbInput.nextLine();

        Map<String,stats> towns = new LinkedHashMap<>();

        while (!"Sail".equalsIgnoreCase(cities)){

            String[] citiesArr = cities.split("\\|\\|");


            String cityName = citiesArr[0];
            int population = Integer.parseInt(citiesArr[1]);
            int gold = Integer.parseInt(citiesArr[2]);

            if (towns.containsKey(cityName)){

                stats existingTown = towns.get(cityName);

                existingTown.setPopulation(existingTown.getPopulation() + population);
                existingTown.setGold(existingTown.getGold() + gold);
            }else {

                    stats stats = new stats(population,gold);

                    towns.put(cityName,stats);
            }


            cities = kbInput.nextLine();
        }

        String command = kbInput.nextLine();

        while (!"End".equalsIgnoreCase(command)){

            String commandType = command.split("=>")[0];
            String townName = command.split("=>")[1];

            stats town = towns.get(townName);


            switch (commandType){

                case "Plunder":

                    int killedPeople = Integer.parseInt(command.split("=>")[2]);
                    int stolenGold = Integer.parseInt(command.split("=>")[3]);


                    town.setPopulation(town.getPopulation() - killedPeople);
                    town.setGold(town.getGold() - stolenGold);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",townName,stolenGold,killedPeople);

                    if (town.getPopulation() <= 0 || town.getGold() <= 0){

                        System.out.printf("%s has been wiped off the map!%n",townName);

                        towns.remove(townName);
                    }


                    break;

                case "Prosper":

                    int goldAdded = Integer.parseInt(command.split("=>")[2]);

                    if (goldAdded < 0 ){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {

                        town.setGold(town.getGold() + goldAdded);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldAdded,townName,town.getGold());
                    }


                    break;
            }

            command = kbInput.nextLine();

        }

        if (towns.size() == 0){

            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }else {

            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",towns.size());

            for (Map.Entry<String,stats>entry: towns.entrySet()) {

                stats stats = entry.getValue();

                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),stats.getPopulation(),stats.getGold());

            }


        }






    }

    static class stats{

        private int population;
        private int gold;

        public stats(int population, int gold){

            this.population = population;
            this.gold = gold;

        }

        public int getPopulation(){

            return this.population;

        }

        public int getGold(){

            return this.gold;
        }

        public void setPopulation(int population){

            this.population = population;

        }

        public void setGold(int gold){

            this.gold = gold;

        }
    }
}
