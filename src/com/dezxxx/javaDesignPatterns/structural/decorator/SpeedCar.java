package com.dezxxx.javaDesignPatterns.structural.decorator;

public class SpeedCar extends CarDecorator {

    public SpeedCar(Car car) {
        super(car);
    }

    public String speedCar() {
        return "Speed Car ready to drive and wait for Sport car---->\n";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + speedCar();
    }
}
