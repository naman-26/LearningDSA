package com.naman.lecture31OOP.oop6.comparinig;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student naman = new Student(22,44.8f);
        Student rahul = new Student(32, 54.63f);
        Student ram = new Student(34, 95f);
        Student shyam = new Student(45, 76.27f);
        Student arpit = new Student(3, 88.82f);
        Student rohit = new Student(39, 72.92f);

        Student[] list = {naman, rahul, ram,shyam, arpit, rohit};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


        if (naman.compareTo(rahul) > 0){
            System.out.println("Naman have more marks");
        }else if (naman.compareTo(rahul) < 0){
            System.out.println("Rahul have more marks");
        }else {
            System.out.println("Equal marks");
        }

    }
}
