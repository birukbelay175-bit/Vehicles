package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        // Moped object
        Moped slowRide = new Moped("Red", 2, 50, 5);

        // Car object
        Car familyCar = new Car("Black", 5, 500, 15);

        // SemiTruck object
        SemiTruck bigTruck = new SemiTruck("Blue", 2, 10000, 300);

        // Hovercraft object
        Hovercraft hover = new Hovercraft("Silver", 8, 2000, 100);

        // Print values
        System.out.println("Moped Color: " + slowRide.getColor());

        System.out.println("Car Passengers: "
                + familyCar.getNumberOfPassengers());

        System.out.println("Truck Cargo Capacity: "
                + bigTruck.getCargoCapacity());

        System.out.println("Hovercraft Fuel Capacity: "
                + hover.getFuelCapacity());
    }
}
