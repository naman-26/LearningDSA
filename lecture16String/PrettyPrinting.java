package com.naman.lecture16String;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a= 453.1274f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println(); // for new line

        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();

        System.out.printf("Hello my name is %s and I am %s", "naman", "cool");

    }
}
