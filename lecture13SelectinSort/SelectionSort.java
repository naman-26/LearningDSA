package com.naman.lecture13SelectinSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for (int i =0; i < arr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            // swap
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last]=temp;
        }
    }

    // to find index with maximum item
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = 0; i <=end; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }

        return max;
    }
}
