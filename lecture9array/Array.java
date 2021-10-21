package com.naman.lecture9array;

public class Array {
    public static void main(String[] args) {

        //Syntax
        // datatype[] variable_name = new datatype[size];


        int[] a = new int[5] ;

        //or
        int[] b = {23,12,34,15,45,};


        int[] rollno; // declaration of array. rollno is getting defined in the stack
        rollno = new int[5]; // initialisation: here object is being created in the memory (heap)


        // Dynamic memory allocation - allocating memory at run time
        // array in java is a dynamic memory allocation

        // 1. array objects are stored in heap memory
        // 2. Heap objects are not continuous
        // 3. Dynamic memory allocation
        // Hence, Array in java may not be continuous(depends on JVM)

        // new is a keyword used to create a object


        String[] arr = new String[4]; //String Array

    }
}
