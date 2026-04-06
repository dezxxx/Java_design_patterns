package com.dezxxx.javaDesignPatterns.creational.prototype;


public class Cats implements Clone {

    private String name;
    private String color;
    private int age;

    public Cats(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object copy() {
        Cats copy = new Cats(name, color, age);
        return copy;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
