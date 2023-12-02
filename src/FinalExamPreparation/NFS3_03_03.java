package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NFS3_03_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int carsNumbers = Integer.parseInt(kbInput.nextLine());

        Map<String,CARS>carsContainer = new LinkedHashMap<>();

        String input = kbInput.nextLine();

        for (int i = 0; i < carsNumbers; i++) {

            String carName = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);

            CARS carz = new CARS(mileage,fuel);

            carsContainer.put(carName,carz);

        }




        String command = kbInput.nextLine();


        while (!"Stop".equalsIgnoreCase(command)){

            String commandType = command.split(" : ")[0];
            String car = command.split(" : ")[1];

            CARS thisCar = carsContainer.get(car);


            switch (commandType){

                case "Drive":
                    int fuelNeeded = Integer.parseInt(command.split(" : ")[3]);
                    int distance = Integer.parseInt(command.split(" : ")[2]);

                    thisCar.setMileage(thisCar.getMileage() + distance);

                    if (fuelNeeded >= thisCar.getFuel()){
                        thisCar.setFuel(thisCar.getFuel() - fuelNeeded);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuelNeeded);

                    }else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;

                case "Refuel":
                    int fuelToAdd = Integer.parseInt(command.split(" : ")[2]);

                    if (thisCar.getFuel() + fuelToAdd >= 75){
                        thisCar.setFuel(75);
                    }

                    break;

                case "Revert":

                    break;

            }

            command = kbInput.nextLine();
        }



    }

    static class CARS{

        private int mileage;
        private int fuel;

        public CARS(int distance, int fuel) {
            this.mileage = distance;
            this.fuel = fuel;
        }

        public int getMileage() {
            return this.mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return this.fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }


}
