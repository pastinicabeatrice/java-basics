package oop.lab1;

public class Car {
    String make = "Toyota";
    String model = "Yaris Cross";
    int year = 2026;
    double price = 25.000;
    boolean isRunning=false;

    void start(){
        isRunning=true;
        System.out.println("You start the engine.");
    }

    void stop(){
        isRunning=false;
        System.out.println("You stop the engine!");
    }

    void drive(){
        System.out.println("You drive the "+model);
    }

    void brake(){
        System.out.println("You brake the "+model);
    }
}
