import Entities.Vehicle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Vehicle vehicle = new Vehicle();

        System.out.print("Vehicle model: ");
        vehicle.model = sc.nextLine();

        System.out.print("Fuel consumption (km/l): ");
        vehicle.fuelConsumption = sc.nextDouble();

        System.out.print("Initial fuel (liters): ");
        vehicle.fuel = sc.nextDouble();

        System.out.println();
        System.out.println(vehicle);

        System.out.println();
        System.out.print("Distance to drive (km): ");
        double distance = sc.nextDouble();
        vehicle.drive(distance);

        System.out.println("After driving:");
        System.out.println(vehicle);

        System.out.println();
        System.out.print("Fuel to refuel (liters): ");
        double liters = sc.nextDouble();
        vehicle.refuel(liters);

        System.out.println("After refuel:");
        System.out.println(vehicle);

        sc.close();
    }
}
