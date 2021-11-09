package com.naman.lecture30MazeAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;

// Printing path steps matrix and path

public class Q6 {
    public static void main(String[] args) {
        boolean[][] board1 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board1.length][board1[0].length];

        allPathPrint("",board1, 0,0, path, 1);

    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step ){
        if (r == maze.length-1 && c == maze[0].length -1){
            path[r][c] = step;
            for ( int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }

        ArrayList<String> ans = new ArrayList<>();

        // Return when the cell is already visited
        if (maze[r][c] == false){
            return ;
        }

        //making changes
        maze[r][c] = false;
        path[r][c] = step;

        //Down
        if(r < maze.length-1){
            allPathPrint(p + "D",maze, r+1, c, path, step+1);
        }

        //Right
        if (c < maze[0].length-1){
            allPathPrint(p+"R",maze, r, c+1, path, step+1);
        }

        //Up
        if (r > 0){
            allPathPrint(p+"U",maze, r-1, c, path, step+1);
        }

        //Left
        if (c > 0){
            allPathPrint(p+"L",maze, r, c-1, path, step+1);
        }

        // retrieving changes
        maze[r][c] = true;
        path[r][c]=0;
    }
}
