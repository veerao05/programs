package com.arrays.top50;

/*
Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K
Time Complexity: O(n2), traversing the array for each element
Auxiliary Space: O(1)
 */
public class CountPairsWithGivenSum {
    public static void getPairsCount(int[] arr, int K)
    {
        // Initialize result
        int count = 0;

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == K)
                    count++;

        System.out.printf("Count of pairs is %d", count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int K = 6;
        getPairsCount(arr, K);
    }
}
