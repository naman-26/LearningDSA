package com.naman.lecture10LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {99,1,2,3,45},
            {2,34,6,5,66,39}
        };

        int target= 34;
        int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchIn2D(int[][] arr, int target) {
        for (int i =0; i < arr.length; i++){
            for (int j=0; j<arr[i].length; j++ ){
                if ( arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[] {-1,-1} ;
    }
}
