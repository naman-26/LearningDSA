package com.naman.lecture21MathsForDSA;

// https://leetcode.com/problems/count-primes/

// Program to print Prime no. till n
// Auxiliary Space = O(N)
// Time Complexity = O( N * log(log N) )

// time complexity to brute force approach is high, therefore we can use this method

public class Sieve {
    public static void main(String[] args) {
        int n= 40;

        // by default all the values in boolean array will be false
        // indices are taken as number form 0 to n
        boolean[] notPrimes = new boolean[n+1];
        sieve(n, notPrimes);
    }

    // false in array means number is prime
    static void sieve(int n, boolean[] notPrimes ){
        for (int i=2; i*i<= n; i++ ){
            if(!notPrimes[i]){
                // multiple of prime numbers are notPrime, therefore writing true
                for (int j= i*2; j<=n; j+=i){
                    notPrimes[j]=true;
                }
            }
        }

        // printing values that have false, are prime no.
        for (int i=2; i<=n; i++){
            if (!notPrimes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
