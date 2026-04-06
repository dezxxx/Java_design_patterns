package com.dezxxx.javaDesignPatterns.behavioral.iterator;

public interface Collection<T> {
    Iterator<T> createIterator();
}
