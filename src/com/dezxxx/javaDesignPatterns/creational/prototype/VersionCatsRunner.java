package com.dezxxx.javaDesignPatterns.creational.prototype;

public class VersionCatsRunner {
    public static void main(String[] args) {
        Cats masterCats = new Cats("Masya","grey", 14);
        System.out.println(masterCats);

        System.out.println("---------------------------");

        CatsFactory factory = new CatsFactory(masterCats);
        Cats masterClone  = factory.cloneCats();
        System.out.println(masterClone);


        System.out.println(" masterCats and masterClone equals???: " + masterCats.equals(masterClone));
    }
}
