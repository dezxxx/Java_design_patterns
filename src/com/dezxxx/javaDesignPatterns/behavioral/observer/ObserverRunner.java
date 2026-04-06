package com.dezxxx.javaDesignPatterns.behavioral.observer;

// запуск / runner
public class ObserverRunner {

    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Observer user1 = new Subscriber("Sergey");
        Observer user2 = new Subscriber("Elena");
        Observer user3 = new Subscriber("Mira");

        agency.addObserver(user1);
        agency.addObserver(user2);
        agency.addObserver(user3);

        agency.addNews("New Java version released!");
        agency.addNews("Observer pattern explained.");

        agency.removeNews("New Java version released!");

        agency.removeObserver(user2);

        agency.addNews("Only Sergey and Mira receive this news.");

        agency.removeNews("Observer pattern explained.");
    }
}