package com.naman.lecture31OOP.oop2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    // static variable
    static long population;

    static void message(){
        System.out.println("Hello");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;

        Human.message();
    }
}
