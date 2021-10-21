package com.naman.lecture8Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,54,6,7,8,9,56,54,33);
        fun(3,4,5);

        multiple(2,3,"naman","rahul", "rohit");

    }


    // v is a variable length argument, it can have any(As we wish) number of values
    static void multiple (int a, int b, String ...v){

    }

    static void fun(int ...num) {
        System.out.println(Arrays.toString(num));
    }
}
