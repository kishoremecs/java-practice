package com.practice;

public class Java17Features {
    // Sealed classes (finalized in Java 17)
    public sealed interface Vehicle permits Car, Truck, Motorcycle {
        String getType();
    }

    public static final class Car implements Vehicle {
        private final String model;

        public Car(String model) {
            this.model = model;
        }

        @Override
        public String getType() {
            return "Car: " + model;
        }
    }

    public final class Truck implements Vehicle {
        private final double capacity;

        public Truck(double capacity) {
            this.capacity = capacity;
        }

        @Override
        public String getType() {
            return "Truck with capacity: " + capacity;
        }
    }

    public final class Motorcycle implements Vehicle {
        private final String brand;

        public Motorcycle(String brand) {
            this.brand = brand;
        }

        @Override
        public String getType() {
            return "Motorcycle: " + brand;
        }
    }

    public static void main(String[] args) {
        // Pattern matching with sealed classes
        Vehicle vehicle = new Car("Tesla Model 3");
       /* String description = switch (vehicle) {
            case Car c -> "This is a car: " + c.getType();
            case Truck t -> "This is a truck: " + t.getType();
            case Motorcycle m -> "This is a motorcycle: " + m.getType();
        };*/
//        System.out.println(description);

        // Context-specific type inference
        var list = new java.util.ArrayList<String>();
        list.add("Java 17");
        System.out.println("List contents: " + list);
    }
}