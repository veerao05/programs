package com.arrays.top50;
/*
Given an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Examples:

Input: arr[] = {2, 0, 2}
Output: 2
Explanation: The structure is like below.
We can trap 2 units of water in the middle gap.

Follow the steps mentioned below to implement the approach:

Create two arrays left[] and right[] of size N. Create a variable (say max) to store the maximum found till a certain index during traversal.
Run one loop from start to end:
In each iteration update max and also assign left[i] = max.
Run another loop from end to start:
In each iteration update max found till now and also assign right[i] = max.
Traverse the array from start to end.
The amount of water that will be stored in this column is min(left[i], right[i]) – array[i]
Add this value to the total amount of water stored
Print the total amount of water stored.
Below is the implementation of the above approach.
Time Complexity: O(N)
Auxiliary Space: O(1)
 */
public class TappingRainWater {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int N = arr.length;
        System.out.print(maxWater(arr, N));
    }

    private static int maxWater(int[] arr, int n) {
     // left[i] contains height of tallest bar to the
     // left of i'th bar including itself
    int left[]=new int[n];
    // Right [i] contains height of tallest bar to
    // the right of ith bar including itself
    int right[]=new int[n];

    left[0]=arr[0];
    for(int i=1;i<n;i++){
        left[i]=Math.max(left[i-1],arr[i]); //left array to hold max values
    }
    right[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--){
        right[i]=Math.max(right[i+1],arr[i]);//right array to hold max values
    }
    int ans=0;

    // Calculate the accumulated water element by
    // element consider the amount of water on i'th bar,
    // the amount of water accumulated on this
    // particular bar will be equal to min(left[i],
    // right[i]) - arr[i] .
    for(int i=0;i<n;i++){
        ans+= Math.min(left[i],right[i])-arr[i];
    }
    return  ans;


    }
}
