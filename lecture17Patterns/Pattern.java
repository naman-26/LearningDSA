package com.naman.lecture17Patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern21(5);
    }

    static void pattern1(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern2( int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern3( int n ){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern4( int n){
        for(int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for( int i=1; i<= 2*n; i++){
            int totalColsInRow = i>n ? 2*n - i: i;
            for(int j=1; j<=totalColsInRow; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern6(int n){

        for(int i =1; i<=n ; i++ ){
            for(int s =1; s<=n-i; s++){
                System.out.print(" ");
            }
            for( int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=1; i<=n; i++){
            int numOfCol = 2*i -1 ;
            int space = n - i;
            for (int s=1; s<=space; s++){
                System.out.print(" ");
            }

            for(int j=1; j<=numOfCol; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int i=1; i<= 2*n ; i++){
            int numOfCol = i > n ? i-n : n-i+1;
            int space = n-numOfCol;
            for (int s =1; s<=space; s++){
                System.out.print(" ");
            }
            for (int j=1; j<=numOfCol; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern13 (int n ){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<i*2; j++){
                if(i==n){
                    System.out.print("*");
                }else if(j==1 || j==i*2-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }


    static void pattern28(int n){
        for(int i=1; i<=2*n; i++){
            int totalColInRow= i>n ? 2*n -i : i;

            int numofSpace = n-totalColInRow+1;
            for (int s=1; s<numofSpace; s++){
                System.out.print(" ");
            }

            for (int j=1; j<=totalColInRow; j++){
               System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int i=1; i<=n; i++){

            for (int s=1; s<=n-i;s++){
                System.out.print("  ");
            }
            for(int j=i; j>=1 ; j--){
                System.out.print(j + " ");
            }
            for (int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n){
        for (int i=1; i<=2*n; i++){

            int numOfCol= i >= n ?  2*n -i : i;
            int space= n- numOfCol;

            for (int s=1; s<=space;s++){
                System.out.print(" ");
            }


            for(int j=numOfCol; j>=1 ; j--){
                System.out.print(j);
            }
            for (int j=2; j<=numOfCol; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void pattern31(int n){
        int originalN=n;
        n= 2*n;
        for(int i=0; i<= n  ; i++){
            for (int j= 0; j <= n ; j++){
                int atEveryIndex= originalN - Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }

    static void pattern19 (int n){
        for(int i=1; i< 2*n; i++){
            for (int j=1; j<=2*n; j++){
                if(i<=n){
                    if(j<=n){
                        if (j <= i) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }else{
                        if (j <= 2*n-i) {
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                }else {
                    if(j<=n){
                        if (j <= 2*n-i) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }else{
                        if (j < i+1) {
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                }
            }

            System.out.println();
        }
    }

    static void pattern21 (int n){
        int count=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (count>9){
                    System.out.print(count + " ");
                }else
                    System.out.print(count + "  " );
                count++;
            }

            System.out.println();
        }
    }
}
