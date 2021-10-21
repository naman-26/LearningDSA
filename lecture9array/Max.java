package com.naman.lecture9array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(max<arr[i])
                max = arr[i];

        }

        return max;
    }

    static int maxRange(int[] arr, int start , int end) {
        int max = arr[start];
        for (int i = start; i<end; i++){
            if(max<arr[i])
                max = arr[i];

        }

        return max;
    }
}
