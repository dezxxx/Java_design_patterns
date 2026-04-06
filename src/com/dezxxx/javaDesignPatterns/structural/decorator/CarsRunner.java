package com.dezxxx.javaDesignPatterns.structural.decorator;

public class CarsRunner {
    public static void main(String[] args) {
        Car car = new SportCar(new SpeedCar(new BasicCar()));
        System.out.println(car.getDescription());

        System.out.println("All cars is ready for STRAT!!!!");
    }

}
