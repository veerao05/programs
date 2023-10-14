package com.arrays.top50;
/*
Given a sorted array and a number x, find the pair in array whose sum is closest to x

Examples:

Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
Output: 22 and 30

Input: arr[] = {1, 3, 4, 7, 10}, x = 15
Output: 4 and 10
Naive Approach:- A simple solution is to consider every pair and
keep track of the closest pair (the absolute difference between pair sum and x is minimum).
Finally, print the closest pair. The time complexity of this solution is O(n2)
Time Complexity:- O(N^2)
Auxiliary Space:- O(1)

 */
public class PairCloseToSum {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 28, 29, 30, 40 };
        int x = 54;
        int n = arr.length;
        printClosest(arr, n, x);
    }

    private static void printClosest(int[] arr, int n, int x) {
        int leftIndex = 0;
        int rightIndex = 0;
        int temp= Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(arr[i]+arr[j]-x)<temp){
                    leftIndex = i;
                    rightIndex = j;
                    temp = Math.abs(arr[i]+arr[j]-x);
                }
            }
        }
        System.out.println("The closest pair is "+ arr[leftIndex] + " and "+ arr[rightIndex]);
    }
}
