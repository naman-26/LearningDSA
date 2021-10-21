package com.naman;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // type casting
        int num1 = (int)(65.2);
        System.out.println(num1);


        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c*d /e;

        System.out.println(b);
        System.out.println(f);


        int number = 'a';
        System.out.println(number); // ASCII value


        byte x= 42;
        char y= 'a';
        short s= 1024;
        int q =50000;
        float o = 5.67f;
        double h = 0.1234;
        double result = (o * x) + (q / y) - (h * s);
        // float + integer - double = double
        System.out.println((o * x) + " " + (q / y) + " " + (h * s));
        System.out.println(result);
    }
}
