package com.naman.lecture18Recursion;

//https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(45632, 0));
    }

    static int sumOfDigits(int num, int sum){
        if(num/10==0){
            sum+=num;
            return sum;
        }

        sum= sum+ num%10;

        return sumOfDigits(num/10, sum);
    }
}
