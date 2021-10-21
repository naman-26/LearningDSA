package com.naman.lecture18Recursion;

// https://www.geeksforgeeks.org/sum-triangle-from-array/

import java.util.Arrays;

public class SumtriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        sumTriangle(arr);

    }

    static void sumTriangle(int[] arr){

        //base condition
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] a = new int[arr.length-1];
        for (int i=0; i<arr.length-1; i++){
            a[i]=arr[i]+arr[i+1];
        }

        sumTriangle(a);
        System.out.println(Arrays.toString(arr));

    }
}
