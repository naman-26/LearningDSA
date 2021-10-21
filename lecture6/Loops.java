package com.naman.lecture6;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        for (int i=1; i<=num; ++i){
            System.out.println(i);
        }

        //while loop
        /*
            Syntax:
            while (condition){
                //body
            }
         */

        //do while
        /*
            Syntax:

            do {
                //body
            }while(condition);

         */

    }
}
