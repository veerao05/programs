package com.arrays.top50;

import java.util.Arrays;
/*
Max and Min Element in the Array
Time Complexity: O(n)
Auxiliary Space: O(1), as no extra space is used
 */
public class MinAndMaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {12, 1234, 45, 67, 1};
        System.out.println("Maximum element of array: "+Arrays.stream(arr).max().getAsInt());
        System.out.println("Minimum element of array: "+Arrays.stream(arr).min().getAsInt());
    }
}
