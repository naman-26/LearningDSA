package com.naman.lecture9array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] =22;
        arr[1] =23;
        arr[2] =24;
        arr[3] =25;
        arr[4] =26;
        System.out.println(arr[3]);

        // input using for loop
        for (int i = 0; i<arr.length; i++) {
            arr[i]= in.nextInt();
        }

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }

        //for each loop
        for (int num : arr){ // for every element in array, print the elements
            System.out.println(num + ""); // here num represents element of array
        }

        System.out.println(Arrays.toString(arr)); //another way to print array



        //array of object
        String[] str = new String[4];
        for (int i = 0; i<str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1]="naman";
    }
}
