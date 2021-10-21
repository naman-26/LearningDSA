package com.naman.lecture22RecursionEasyQ;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber1(4927);
        System.out.println(sum);
        System.out.println(reverseNumber2(4927));
    }

    static int sum =0;
    static void reverseNumber1(int n){
        if(n == 0){
            return;
        }

        int rem = n%10;
        sum = sum*10 + rem;

        reverseNumber1(n/10);
    }

    static int reverseNumber2(int n){
        // sometimes we might need additional arguments
        // int that case, make another function
        int digits = (int)(Math.log10(n)) + 1 ;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }

        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
