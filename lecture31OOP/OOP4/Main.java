package com.naman.lecture31OOP.OOP4;

public class Main {
    public static void main(String[] args) {
        A obj = new A(9, "Naman");

        // need to do few things
        // 1. access the data members
        // 2. modify the data members

        obj.getNum();
        obj.setNum(22);
        System.out.println(obj.name);

    }
}
