package com.naman.lecture20BitsManipulation;

public class Power {
    public static void main(String[] args) {
        int base= 2;
        int power =4;

        int ans=1;

        while (power>0){
            if((power & 1)==1){
                ans *= base;
            }

            power = power >>1;

            base = base* base;

        }

        System.out.println(ans);
    }
}
