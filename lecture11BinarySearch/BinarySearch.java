package com.naman.lecture11BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-234,-23,-6,0,1,2,3,4,5,6,88,90};
        int target =-23;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    // return -1 if target does not found
    static int binarySearch( int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            //find middle element
            // int mid = (start + end)/2;
            // (start + end), might exceed the limit of int.
            //therefore the better way
            int mid = start + (end - start) / 2;


            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }

        return -1;
    }

}
