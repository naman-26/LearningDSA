package com.naman.lecture31OOP.Intoduction;

public class Intro {
    public static void main(String[] args) {
        // store 5 roll no.
        int[] numbers = new int[5];

        // store 5 names
        String [] names = new String[5];

        // data of 5 student: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student naman = new Student(13, "Naman Ag", 89);

        System.out.println(naman.marks);

//        naman.rno = 11;
//        naman.name = "Naman Agrawal";
//        naman.marks = 88;

        System.out.println(naman.rno);
        System.out.println(naman.marks);
        System.out.println(naman.name);

        naman.greeting();

        Student ram = new Student(naman);
        System.out.println(ram.name);

        Student random = new Student();

        System.out.println(random.name);


    }

}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;


    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    // constructor
    Student() {
//            this.rno = 11;
//            this.name = "Naman Agrawal";
//            this.marks = 88;

        // other way
        // by calling another constructor
        this(11, "Naman Agrawal", 88);

    }


    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

}
