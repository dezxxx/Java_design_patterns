package com.dezxxx.javaDesignPatterns.structural.decorator;

public class CarDecorator implements Car {

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }
}
