package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NFS3_03_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        int carsNumbers = Integer.parseInt(kbInput.nextLine());

        Map<String,CARS>carsContainer = new LinkedHashMap<>();



        for (int i = 0; i < carsNumbers; i++) {

            String input = kbInput.nextLine();

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



                    if (fuelNeeded < thisCar.getFuel()){
                        thisCar.setMileage(thisCar.getMileage() + distance);
                        thisCar.setFuel(thisCar.getFuel() - fuelNeeded);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuelNeeded);

                        if (thisCar.getMileage() >= 100_000){

                            System.out.printf("Time to sell the %s!%n",car);
                            carsContainer.remove(car);
                        }

                    }else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;

                case "Refuel":
                    int fuelToAdd = Integer.parseInt(command.split(" : ")[2]);

                    if (thisCar.getFuel() + fuelToAdd >= 75){
                        int fuelAdded  = 75 - thisCar.getFuel();
                        thisCar.setFuel(75);
                        System.out.printf("%s refueled with %d liters%n",car,fuelAdded);
                    }else {
                        thisCar.setFuel(thisCar.getFuel() + fuelToAdd);

                        System.out.printf("%s refueled with %d liters%n",car,fuelToAdd);
                    }

                    break;

                case "Revert":
                    int km2Decrease = Integer.parseInt(command.split(" : ")[2]);

                    if (thisCar.getMileage() - km2Decrease < 10000){

                        thisCar.setMileage(10000);
                    }else {
                        thisCar.setMileage(thisCar.getMileage() - km2Decrease);

                        System.out.printf("%s mileage decreased by %d kilometers%n",car,km2Decrease);
                    }

                    break;

            }

            command = kbInput.nextLine();
        }
        for (Map.Entry<String, CARS>entry: carsContainer.entrySet()) {

            CARS carEntry = entry.getValue();

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),carEntry.getMileage(),carEntry.getFuel());
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
