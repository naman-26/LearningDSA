package com.naman.lecture11BinarySearch;

public class InfiniteArraySearchBS {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,9,22,25,67,74,92,99,101,123};
        int target = 22;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        // first find the range
        // first start with box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end+1;
            //double the box size
            // end = previous end + 2 * size of box
            end= end+ 2*(end - start + 1) ;
            start = newStart;
        }

        int answer = binarySearch(arr,target, start, end);

        return answer;
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]>target){
                end=mid-1;
            }else if (arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
