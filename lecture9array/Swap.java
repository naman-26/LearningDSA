package com.naman.lecture9array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        swap(arr,1,4);

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
