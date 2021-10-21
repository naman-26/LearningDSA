package com.naman.lecture22RecursionEasyQ;

public class CountZeros {
    public static void main(String[] args) {
        int n = 12120;

        if(n==0){
            System.out.println(1);
        }
        else
            System.out.println(countZero(n));


        System.out.println(count(12120));
    }

    static int countZero(int n){
        if( n == 0){
            return 0;
        }


        if(n%10 == 0){
            return 1 + countZero(n/10);
        } else
            return countZero(n/10);

    }

    static  int count(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }

        if(n% 10 == 0){
            return helper(n/10, count+1);
        }

        return  helper(n/10, count);
    }
}
