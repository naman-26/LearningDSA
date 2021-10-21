package com.naman.lecture22RecursionEasyQ;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(111));
    }

    static boolean palindrome (int n){
        return n == reverseNumber2(n);
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
