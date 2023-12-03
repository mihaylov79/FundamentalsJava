package Fundamentals_FinalExam_03_12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String commandInput = kbInput.nextLine();
        Map<String,Animals> animalsList = new LinkedHashMap<>();
        Map<String,Integer> areaList = new LinkedHashMap<>();

        while (!"EndDay".equalsIgnoreCase(commandInput)){

            String commandType = commandInput.split(": ")[0];
            String commandStats = commandInput.split(": ")[1];
            String animalName = commandStats.split("-")[0];

            switch (commandType){

                case "Add":
                    int neededFood = Integer.parseInt(commandStats.split("-")[1]);
                    String area = commandStats.split("-")[2];

                    if (animalsList.containsKey(animalName)){

                        Animals existingAnimal = animalsList.get(animalName);
                        existingAnimal.setNeededFood(existingAnimal.getNeededFood() + neededFood);

                    }else {

                        Animals newAnimal = new Animals(neededFood,area);
                        animalsList.put(animalName,newAnimal);

                        if (areaList.containsKey(newAnimal.getArea())) {

                            areaList.replace(newAnimal.getArea(),areaList.get(newAnimal.getArea())+1);

                        }else {

                            areaList.put(newAnimal.getArea(),1);
                        }
                    }

                    break;

                case "Feed":
                    int food = Integer.parseInt(commandStats.split("-")[1]);


                    if (animalsList.containsKey(animalName)){

                        Animals animalTodFeed = animalsList.get(animalName);
                        animalTodFeed.setNeededFood(animalTodFeed.getNeededFood() - food);

                        if (animalTodFeed.getNeededFood() <= 0){

                            animalsList.remove(animalName);

                            System.out.printf("%s was successfully fed%n",animalName);

                            areaList.replace(animalTodFeed.getArea(),areaList.get(animalTodFeed.getArea())-1);
                        }
                    }else {
                        break;
                    }
                    break;
            }


            commandInput = kbInput.nextLine();
        }

        System.out.println("Animals:");

        for (Map.Entry<String,Animals>animal: animalsList.entrySet()) {
            Animals animals = animal.getValue();
            System.out.printf(" %s -> %dg%n",animal.getKey(),animals.getNeededFood());

        }

        System.out.println("Areas with hungry animals:");

        for (Map.Entry<String,Integer>entry: areaList.entrySet()) {

            if (entry.getValue() > 0){
                System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
            }

            //System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());

        }







    }

    static class Animals{

        private int neededFood;

        private String area;

        public Animals(int neededFood, String area) {
            this.neededFood = neededFood;
            this.area = area;
        }

        public int getNeededFood() {
            return this.neededFood;
        }

        public void setNeededFood(int neededFood) {
            this.neededFood = neededFood;
        }

        public String getArea() {
            return this.area;
        }

        public void setArea(String area) {
            this.area = area;
        }
    }
}
