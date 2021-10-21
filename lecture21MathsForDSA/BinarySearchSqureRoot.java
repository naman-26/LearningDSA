package com.naman.lecture21MathsForDSA;

// O(log(n)) = time complexity

public class BinarySearchSqureRoot {
    public static void main(String[] args) {
        int n =50;
        int p=3;


        System.out.println(sqrt(n,p));

        // pretty printing
        System.out.printf("%.3f", sqrt(n,p));
    }

    static double sqrt(int n, int p){
        int s=0;
        int e=n;

        double root= 0.0;

        while (s<=e){
            int mid = s + (e-s)/2;
            if(mid*mid > n){
                e=mid-1;
            }else if(mid*mid < n){
                s=mid+1;
            }else {
                // perfect root no.
                return mid;
            }
        }

        root= root + e;
        double incr = 0.1;
        for (int i=0; i<p; i++){
            while (root*root <n){
                root += incr;
            }

            if (root*root==n){
                return root;
            }

            root -= incr;
            incr/=10;
        }



        return root;
    }
}
