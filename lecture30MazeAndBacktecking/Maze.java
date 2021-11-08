package com.naman.lecture30MazeAndBacktecking;

        import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(path("",3,3));
        System.out.println(pathDiagonal("",3,3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRectrictions("",board, 0,0);
    }

    static int count(int r, int c){
        if( r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count (r,c-1);

        return right+left;
    }

    static ArrayList<String> path(String p,int r, int c ){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(path(p + "D", r-1, c));
        }

        if (c>1){
            ans.addAll(path(p+"R", r, c-1));
        }


        return ans;
    }

    static ArrayList<String> pathDiagonal(String p,int r, int c ){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        //Diagonal
        if(r>1 && c>1){
            ans.addAll(pathDiagonal(p + "d", r-1, c-1));
        }

        //Down
        if(r>1){
            ans.addAll(pathDiagonal(p + "D", r-1, c));
        }

        //Right
        if (c>1){
            ans.addAll(pathDiagonal(p+"R", r, c-1));
        }

        return ans;
    }


    static void pathRectrictions(String p,boolean[][] maze, int r, int c ){
        if (r== maze.length-1 && c == maze[0].length -1){
            System.out.println(p);
            return ;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (maze[r][c] == false){
            return ;
        }

        if(r < maze.length-1){
            pathRectrictions(p + "D",maze, r+1, c);
        }

        if (c < maze[0].length-1){
            pathRectrictions(p+"R",maze, r, c+1);
        }

    }
}
