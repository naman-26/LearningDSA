package com.naman.lecture8Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2= input.nextInt();
        int sum = num1+ num2;
        System.out.println("The sum = "+ sum);
    }

    /*

        return_type name(arguments) {
             //body
             return statement;
        }

     */

}
