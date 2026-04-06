package com.dezxxx.javaDesignPatterns.structural.decorator;

public class SportCar extends CarDecorator {


    public SportCar(Car car) {
        super(car);
    }

    public String sportCar() {
        return "Sport Car ready to drive-->\n ";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + sportCar();
    }
}
