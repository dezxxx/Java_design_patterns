package com.dezxxx.javaDesignPatterns.behavioral.observer;
// издатель / subject
public interface Subject {

    void addObserver(Observer observer); // добавить подписчика / add observer

    void removeObserver(Observer observer); // удалить подписчика / remove observer

    void notifyObservers(String message); // уведомить подписчиков / notify observers

}