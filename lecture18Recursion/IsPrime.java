package com.naman.lecture18Recursion;

//https://www.geeksforgeeks.org/recursive-program-prime-number/

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(1,2));
    }

    static boolean isPrime(int num, int count){
        if(num%count!=0 && count > num/2){
            return false;
        }else if(num%count==0){
            return true;
        }

        return isPrime(num,count+1);
    }

    static boolean isPrime2(int n, int i)
    {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime2(n, i + 1);
    }
}
