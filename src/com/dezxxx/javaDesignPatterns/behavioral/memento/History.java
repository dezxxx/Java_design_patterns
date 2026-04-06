package com.dezxxx.javaDesignPatterns.behavioral.memento;

// Caretaker / Хранитель
import java.util.Stack;


public class History {

    private final Stack<Memento> history = new Stack<>();

    public void save(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (history.isEmpty()) {
            return null;
        }
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}