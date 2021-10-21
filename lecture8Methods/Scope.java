package com.naman.lecture8Methods;

public class Scope {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;

        String name = "Naman";

        {
            a = 66; // reassign the value
            int c = 99;
            // values initialised in the block, will remain in block
            name ="Rahul";
            System.out.println(name);
        }

        // cannot use c outside the block
        System.out.println(a);

        //Scoping in for loop
        for (int i=0; i< 4;i++){
            System.out.println(i);
        }
    }

    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
