package com.dezxxx.javaDesignPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;


// новостное агентство / news agency
public class NewsAgency implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private final List<String> newsList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added: " + observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed: " + observer);
    }

    public void addNews(String news) { // добавить новость / add news
        newsList.add(news);
        notifyObservers("News added: " + news);
    }

    public void removeNews(String news) { // удалить новость / remove news
        if (newsList.remove(news)) {
            notifyObservers("News removed: " + news);
        } else {
            System.out.println("News not found: " + news);
        }
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public List<String> getNewsList() {
        return newsList;
    }
}