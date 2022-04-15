package Exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Vehicle> listOfCars = new ArrayList<>();
        List<Vehicle> listOfTrucks = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] vehicleDetails = input.split("\\s+");
            Vehicle vehicle = new Vehicle(vehicleDetails[0], vehicleDetails[1], vehicleDetails[2], Integer.parseInt(vehicleDetails[3]));

            switch (vehicleDetails[0]) {
                case "car":
                    listOfCars.add(vehicle);
                    break;
                case "truck":
                    listOfTrucks.add(vehicle);
                    break;
            }
            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!"Close the Catalogue".equals(input)) {
            printInfo(listOfCars, listOfTrucks, input);
            input = scan.nextLine();
        }

        System.out.println("Cars have average horsepower of: " + getCarsAverageHP(listOfCars));
        System.out.println("Trucks have average horsepower of: " + getTrucksAverage(listOfTrucks));
    }

    private static String getTrucksAverage(List<Vehicle> listOfTrucks) {
        int allHP = 0;
        for (Vehicle truck : listOfTrucks) {
            allHP += truck.getHorsePower();
        }
        double averageHP = 1.0 * allHP / listOfTrucks.size();
        if(listOfTrucks.isEmpty()){
            return "0.00.";
        }
        return String.format("%.2f.", averageHP);
    }

    private static String getCarsAverageHP(List<Vehicle> listOfCars) {
        int allHP = 0;
        for (Vehicle car : listOfCars) {
            allHP += car.getHorsePower();
        }
        double averageHP = 1.0 * allHP / listOfCars.size();
        if(listOfCars.isEmpty()){
            return "0.00.";
        }
        return String.format("%.2f.", averageHP);
    }

    private static void printInfo(List<Vehicle> listOfCars, List<Vehicle> listOfTrucks, String input) {
        for (Vehicle car : listOfCars) {
            if (car.getModel().equals(input)) {
                System.out.println(car);
            }
        }

        for (Vehicle truck : listOfTrucks) {
            if (truck.getModel().equals(input)) {
                System.out.println(truck);
            }
        }
    }
}
