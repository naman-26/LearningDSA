package com.naman.lecture31OOP.OOP2;

// Singleton class is a class which only allow single object to be created.
public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
