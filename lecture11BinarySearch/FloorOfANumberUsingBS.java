package com.naman.lecture11BinarySearch;

public class FloorOfANumberUsingBS {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }

    static int floorNumber(int[] arr, int target) {

        // but what if target is smaller then the smallest number in array
        if (target<arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]>target){
                end=mid-1;
            }else if (arr[mid]<target){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
