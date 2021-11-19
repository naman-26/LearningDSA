package com.naman.lecture31OOP.oop6.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human naman = new Human(22, "Naman Agrawal");
//        Human twin = new Human(naman);

        Human twin = (Human)(naman.clone());

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]= 900;

        System.out.println(Arrays.toString(naman.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
