package com.naman.lecture21MathsForDSA;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-214));
    }

    static int reverse(int x) {
        int ans=0;
        while(x!=0){
            int temp = x % 10;
            x=x/10;
            if(ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE /10 && temp>7) ){
                return 0;
            }

            if(ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE /10 && temp< -8) ){
                return 0;
            }

            ans = ans*10 + temp;


        }

        return ans;
    }
}
