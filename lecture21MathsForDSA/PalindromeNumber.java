package com.naman.lecture21MathsForDSA;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000660001));
    }

    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int temp = x;
        int a=0;
        while(temp>0){
            int temp1 = temp % 10;
            temp/=10;
            a = a*10 + temp1;
        }

        if(a==x){
            return true;
        }

        return false;
    }
}
