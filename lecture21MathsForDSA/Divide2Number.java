package com.naman.lecture21MathsForDSA;

public class Divide2Number {
    public static void main(String[] args) {
        System.out.println(divide(10,3));
    }

    static int divide(int dividend, int divisor) {

        // Corner case when -2^31 is divided by -1 will give 2^31 which does not exist so overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;


        boolean negative = dividend < 0 ^ divisor < 0;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient =0, subQuot=0;

        while((dividend - divisor) >= 0){
            for (subQuot=0; dividend - (divisor << subQuot << 1) >= 0; subQuot++){

            }

            quotient += 1 << subQuot;

            dividend -= (divisor << subQuot);
        }

        return negative ? -quotient : quotient;

    }
}
