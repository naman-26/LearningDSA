package com.naman.lecture18Recursion;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        System.out.println(product2(100,5));
    }

    static int product(int num1, int num2){
        if(num1==0 || num2==0){
            return 0;
        }
        if(num1>num2){
            return recursionFun(num1, num2, 1);
        }else
            return recursionFun(num2, num1, 1);

    }

    static int recursionFun(int num1, int num2, int count){
        if(count==num2){
            return num1;
        }

        return (num1 + recursionFun(num1, num2, count+1));
    }

    static int product2(int num1, int num2){
        if (num1 < num2)
            return product(num1,num2);

            // iteratively calculate
            // y times sum of x
        else if (num2 != 0)
            return (num1+product(num1,num2-1));

        // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }
}
