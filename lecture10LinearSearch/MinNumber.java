package com.naman.lecture10LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {18, 36,12, -4, 77};
        int min = minNumber(arr);
        System.out.println(min);
    }

    static int minNumber(int[] arr){
        int min = arr[0];
        for (int i =0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }

        return min;
    }
}
