package com.naman.lecture8Methods;

public class OverLoading {
    public static void main(String[] args) {
        fun(26);
        fun("Naman Agrawal");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
