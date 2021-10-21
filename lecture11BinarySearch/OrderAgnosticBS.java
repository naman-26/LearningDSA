package com.naman.lecture11BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-234,-23,-6,0,1,2,3,4,5,6,88,90};
        int[] arr1 = {99,87,66,33,32,24,8,3,0,-23,-90};
        int target = -23;
        int ans = orderAgnosticBS(arr,target);
        int ans1 = orderAgnosticBS(arr1, target);

        System.out.println(ans +" "+ ans1);
    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        //find weather array is sorted in ascending or descending
        boolean isAscending;
        isAscending = arr[start] < arr[end]; //checking the condition


        while (start <= end){
            //find middle element
            // int mid = (start + end)/2;
            // (start + end), might exceed the limit of int.
            //therefore the better way
            int mid = start + (end - start) / 2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                //for descending
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
