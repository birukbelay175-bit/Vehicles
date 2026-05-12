package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        // Create Moped object
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        // Create Car object
        Car familyCar = new Car();
        familyCar.setColor("Black");
        familyCar.setNumberOfPassengers(5);

        // Create SemiTruck object
        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setCargoCapacity(10000);

        // Create Hovercraft object
        Hovercraft hover = new Hovercraft();
        hover.setColor("Silver");

        // Print values
        System.out.println("Moped Color: " + slowRide.getColor());

        System.out.println("Car Passengers: " +
                familyCar.getNumberOfPassengers());

        System.out.println("Truck Cargo Capacity: " +
                bigTruck.getCargoCapacity());

        System.out.println("Hovercraft Color: " +
                hover.getColor());
    }
}
