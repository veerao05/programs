package com.arrays.top50;

import java.util.Arrays;

/*
You are given some heights of n towers and a number k. We can either increase the height of the tower by k or decrease the height by k, but just for once. The problem statement asks to minimize the maximum difference between the heights.
That is to find out the minimum difference between the heights of the towers (longest height-smallest height) after the modification we have done.
Minimize the maximum difference between the heights
Time Complexity: O(N * log(N)), Time is taken for sorting
Auxiliary Space: O(1)
https://www.youtube.com/watch?v=t8_uxrjqC2g
 */
public class MinimiseTowerHeights {
    public static void main(String[] args) {
        int arr[]={1, 15, 10}, k = 6;
        System.out.println("Minimum height::"+minDiffOfTower(arr,k));
    }

    private static int minDiffOfTower(int[] arr, int k) {
        int n=arr.length;
        if(n==1)return 0;
        Arrays.sort(arr);
        int diff= arr[n-1] - arr[0];
        int max, min;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue ; //height should be a non-negative integer
            max= Math.max(arr[i-1]+k,arr[n-1]-k); // whether all remaining towers(arr[i-1]+k) except  arr[n-1]-k(last tower) will be more than the last tower
            min= Math.min(arr[0]+k,arr[i]-k);// whether remaining towers(arr[i]-k) becomes smaller than the first tower arr[0]+k
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}
