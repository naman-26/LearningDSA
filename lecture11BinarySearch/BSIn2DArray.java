package com.naman.lecture11BinarySearch;

//https://leetcode.com/problems/search-a-2d-matrix/

public class BSIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr,16));
        System.out.println(searchMatrixMethod2(arr, 39));
    }

    //O(log N) time complexity(Binary Search)
    static boolean searchMatrix(int[][] matrix, int target) {
        int ans = -1;

        int start=0;
        int end=matrix.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(matrix[mid][0]<target){
                //possible ans
                ans=mid;
                start=mid+1;
            }else if(matrix[mid][0]>target){
                end=mid-1;
            }else{
                return true;
            }
        }

        if(ans==-1){
            return false;
        }

        start=0;
        end=matrix[ans].length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(matrix[ans][mid]<target){
                start=mid+1;
            }else if(matrix[ans][mid]>target){
                end=mid-1;
            }else{
                return true;
            }
        }

        return false;
    }


    // O(N) time complexity(Not a binary search)
    static boolean searchMatrixMethod2(int[][] matrix, int target){
        int r=0;
        int c= matrix.length -1;

        while ( r< matrix.length && c>=0){
            if(matrix[r][c] == target){
                return true;
            }

            if(matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }

        return false;
    }
}
