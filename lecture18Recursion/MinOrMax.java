package com.naman.lecture18Recursion;

// https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/

public class MinOrMax {
    public static void main(String[] args) {
        int[] arr = {12, 1234, 45, 67, 1};
        int max = getMax(arr, arr.length, arr[0]);
        int min = getMin(arr, arr.length, arr[0]);
        System.out.println(max + " " + min);
    }

    static int getMax(int[] arr,int length, int num){

        //base condition
        if(length == 1){
            return num;
        }

        if(arr[length-1]>num){
            num=arr[length-1];
        }

        return getMax(arr, length-1, num);
    }

    static int getMin(int[] arr,int length, int num){

        //base condition
        if(length == 1){
            return num;
        }

        if(arr[length-1]<num){
            num=arr[length-1];
        }

        return getMin(arr, length-1, num);
    }
}
