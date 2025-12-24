package Entities;

public class Vehicle {

    public String model;
    public double fuel;
    public double fuelConsumption; // km por litro

    public double getAutonomy() {
        return fuel * fuelConsumption;
    }

    public void refuel(double liters) {
        fuel += liters;
    }

    public void drive(double distance) {
        double neededFuel = distance / fuelConsumption;

        if (neededFuel <= fuel) {
            fuel -= neededFuel;
        } else {
            fuel = 0;
        }
    }

    @Override
    public String toString() {
        return "Model: " + model
                + ", Fuel: "
                + String.format("%.2f", fuel)
                + " liters, Autonomy: "
                + String.format("%.2f", getAutonomy())
                + " km";
    }
}
