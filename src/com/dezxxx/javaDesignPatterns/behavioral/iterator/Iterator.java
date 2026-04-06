package com.dezxxx.javaDesignPatterns.behavioral.iterator;

// Iterator interface
interface Iterator<T> {
    boolean hasNext();
    T next();
}