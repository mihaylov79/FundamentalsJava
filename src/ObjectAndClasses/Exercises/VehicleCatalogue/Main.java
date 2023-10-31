package ObjectAndClasses.Exercises.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);


        String data = kbInput.nextLine();

        List<Vehicle> vehicles = new ArrayList<>();

        while (!"end".equalsIgnoreCase(data)) {

            String[] dataInput = data.split(" ");
            String type = dataInput[0];
            String model = dataInput[1];
            String color = dataInput[2];
            String hp = dataInput[3];

            Vehicle vehcle = new Vehicle(type,model,color,hp);

            if (type.equals("car")){
                vehcle.setType("Car");
            } else if (type.equals("truck")) {
                vehcle.setType("Truck");
            }

            vehicles.add(vehcle);

            data = kbInput.nextLine();

        }

        data = kbInput.nextLine();

        while (!"Close the Catalogue".equalsIgnoreCase(data)) {

            String model = data;

            for (Vehicle vehicle: vehicles) {

                if (vehicle.getModel().equals(model)){

                    System.out.printf("Type: %s%n" +
                                    "Model: %s%n" +
                                    "Color: %s%n" +
                                    "Horsepower: %s%n",vehicle.getType(),
                            vehicle.getModel(),
                            vehicle.getColor(),vehicle.getHp());
                }
            }
            data = kbInput.nextLine();

        }

        int carHp = 0;
        int truckHp = 0;
        int truckCount = 0;
        int carCount = 0;

        for (Vehicle vehicle: vehicles) {
            if (vehicle.getType().equalsIgnoreCase("Car")){
                carHp += Integer.parseInt(vehicle.getHp());
                carCount++;
            }else {
                truckHp += Integer.parseInt(vehicle.getHp());
                truckCount++;
            }
        }

        double carAvrHp = (double)carHp / carCount;
        double truckAvrHp = (double)truckHp / truckCount;

        if (carHp == 0){
            carAvrHp = 0;
        }
        if (truckHp == 0){
            truckAvrHp = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",carAvrHp);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",truckAvrHp);

    }
}
