package com.dezxxx.javaDesignPatterns.creational.prototype;

public class CatsFactory {
    Cats cats;
    public CatsFactory(Cats cats) {
        this.cats = cats;
    }

    Cats cloneCats () {
        return (Cats) cats.copy();
    }
}


