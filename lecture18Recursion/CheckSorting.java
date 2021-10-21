package com.naman.lecture18Recursion;

// https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/

public class CheckSorting {
    public static void main(String[] args) {
        int[] arr = {20, 20, 45, 89,89};
        String s="a";
        System.out.println(isSortedAscending(arr, arr.length));
    }

    static boolean isSortedAscending(int[] arr, int length){
        if(length<=1){
            return true;
        }

        if(arr[length-1]<arr[length-2]){
            return false;
        }

        return isSortedAscending(arr, length-1);
    }

}
