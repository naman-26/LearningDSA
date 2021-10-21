package com.naman.lecture26QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums, 0, nums.length -1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr , int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s +(e-s)/2;
        int pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            if(s <= e){
                //swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }


        // now my pivot is at correct index, sort two half now
        sort(arr, low, e);
        sort(arr, s, high);

    }
}
