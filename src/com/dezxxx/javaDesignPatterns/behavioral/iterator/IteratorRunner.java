package com.dezxxx.javaDesignPatterns.behavioral.iterator;

// Runner
public class IteratorRunner {

    public static void main(String[] args) {

        String[] devs = {"Ivan", "Alex", "Dmitry", "Sergey"};

        DeveloperTeam team = new DeveloperTeam(devs);

        Iterator<String> iterator = team.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}