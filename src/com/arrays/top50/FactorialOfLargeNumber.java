package com.arrays.top50;

import java.math.BigInteger;
/*
Follow the steps below to solve the given problem:

Declare a BigInteger f with 1 and perform the conventional way of calculating factorial
Traverse a loop from x = 2 to N and multiply x with f and store the resultant value in f

Time Complexity: O(N)
Auxiliary Space: O(1)
 */
public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        int N = 100;
        System.out.println(factorial(N));
    }

    private static BigInteger factorial(int n) {
        BigInteger f
                = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
}
