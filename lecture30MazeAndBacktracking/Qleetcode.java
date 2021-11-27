package com.naman.lecture30MazeAndBacktracking;

//https://leetcode.com/problems/word-search/

// IMPPPPPPPPPPP Q

public class Qleetcode {

    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}
        };



        System.out.println(sol(board,"SEE"));
    }

    public static boolean sol(char[][] board, String word){

        char first = word.charAt(0);

        for (int i =0; i<board.length; i++){
            for (int j =0; j< board[0].length; j++){
                if (board[i][j] == first){
                    boolean exist = maze(board,word,i,j);
                    if (exist){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean maze(char[][] board, String word, int row, int col){

        if(word.length() == 0){
            return true;
        }


        if(row >= board.length || col >= board[0].length || row < 0 || col < 0){
            return false;
        }

        char ch = word.charAt(0);





        if (ch == board[row][col]){

            char temp = board[row][col];
            //change
            board[row][col] = '.';

            boolean exist =
                            //Down
                            maze(board, word.substring(1), row+1, col) ||
                            //Right
                            maze(board, word.substring(1), row, col+1) ||
                            //Up
                            maze(board, word.substring(1), row -1, col) ||
                                    //Left
                            maze(board, word.substring(1), row, col-1) ;

            // retrive
            board[row][col] = temp;

            return exist;

        }else {
            return false;
        }

    }
}
