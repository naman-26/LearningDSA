package com.naman.lecture22RecursionEasyQ;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if( n == 0 ){
            return;
        }

        System.out.println(n);
//        fun(n--);
        fun(--n);

        // n-- v/s --n
        // n--, first pass the value then, decrease it
        // while, --n, first decrease the value than pass it.
    }
}
