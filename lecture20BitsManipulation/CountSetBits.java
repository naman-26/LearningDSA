package com.naman.lecture20BitsManipulation;

// https://leetcode.com/problems/number-of-1-bits/

public class CountSetBits {
    public static void main(String[] args) {
        int n=94967293;
        System.out.println(Integer.toBinaryString(n));


        System.out.println(setBits1(n));

    }

    private static int setBits(int n) {
        int count =0;

        while (n>0){
            count++;
            n = n - (n & -n);
        }

        return count;
    }

    private static int setBits1(int n) {
        int count =0;

        while (n>0){
            count++;
            n = n & (n-1);
        }

        return count;
    }


    // exceed time limit
    static int hammingWeight(int n) {
        int count =0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }

            n = n >> 1;
        }

        return count;
    }
}
