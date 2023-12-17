package Practise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_02_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int plantCount = Integer.parseInt(kbInput.nextLine());

        Map<String,Plant> plantStorage = new LinkedHashMap<>();

        for (int i = 0; i < plantCount; i++) {

            String plantInput = kbInput.nextLine();

            String name = plantInput.split("<->")[0];
            int rarity = Integer.parseInt(plantInput.split("<->")[1]);
            int rating = 0;
            double rateCount = 0;

            Plant inputStats = new Plant(rarity,rating,rateCount);

            if (plantStorage.containsKey(name)){

                Plant existingPlant = plantStorage.get(name);
                existingPlant.setRarity(rarity);
            }else {
                plantStorage.put(name,inputStats);
            }
        }

        String commandInput = kbInput.nextLine();

        while (!"Exhibition".equalsIgnoreCase(commandInput)){

            String commandType = commandInput.split(": ")[0];
            String commandStats = commandInput.split(": ")[1];
            String plantName = commandStats.split(" - ")[0];

            Plant existing = plantStorage.get(plantName);

            switch (commandType){

                case "Rate":
                    int newRating = Integer.parseInt(commandStats.split(" - ")[1]);

                    if (plantStorage.containsKey(plantName)){

                        existing.setRating(existing.getRating() + newRating);

                        existing.setRateCount(existing.getRateCount() + 1.00);

                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Update":

                    int newRarity = Integer.parseInt(commandStats.split(" - ")[1]);

                    if (plantStorage.containsKey(plantName)){

                        existing.setRarity(newRarity);
                    }else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":

                    if (plantStorage.containsKey(plantName)){

                        existing.setRating(0);
                        existing.setRateCount(0.0);
                    }else {
                        System.out.println("error");
                    }

                    break;

            }

            commandInput = kbInput.nextLine();
        }


        System.out.println("Plants for the exhibition:");

        for(Map.Entry<String,Plant>entry : plantStorage.entrySet()){

            Plant plant = entry.getValue();

            if (plant.getRateCount() == 0){
                plant.setRateCount(1);
            }

            double averageRating = plant.getRating() / plant.getRateCount();

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),plant.getRarity(),averageRating);
        }




    }

    static class Plant{

        private int rarity;
        private int rating;
        private double rateCount;

        public Plant(int rarity,int rating,double rateCount){

            this.rarity = rarity;
            this.rating = rating;
            this.rateCount = rateCount;

        }

        public int getRarity(){
            return this.rarity;
        }

        public int getRating(){
            return this.rating;
        }

        public double getRateCount(){
           return this.rateCount;
        }

        public void setRarity(int rarity){
            this.rarity = rarity;
        }

        public void setRating(int rating){
            this.rating = rating;
        }

        public void setRateCount(double rateCount){
            this.rateCount = rateCount;
        }


    }
}
