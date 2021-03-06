package com.naman.lecture11BinarySearch;

public class KthMissingValue {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr,6));
    }

    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]-(mid+1)>=k){
                end=mid-1;
            }else if(arr[mid]-(mid+1)<k){
                start = mid+1;
            }
        }
        return  k+start;
    }
}
