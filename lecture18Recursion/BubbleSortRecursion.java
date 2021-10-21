package com.naman.lecture18Recursion;

import java.util.Arrays;

// https://www.geeksforgeeks.org/recursive-bubble-sort/

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr= {};

        System.out.println(Arrays.toString(bubbleSortR(arr, arr.length-1)));


    }

    static int[] bubbleSortR(int[] arr, int end){

        // base condition
        if(end<=0){
            return arr;
        }

        for (int i=0; i<end; i++){
            if(arr[i]>arr[i+1]){
                //swap
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        return bubbleSortR(arr, end-1);
    }
}
