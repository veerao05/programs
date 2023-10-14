package com.arrays.top50;

/*
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
kadane's Algorithm
Input Format

A = [1, 2, 3, 4, -10]
The first and the only argument contains an integer array, A.

Output Format
output =10;
Return an integer representing the maximum possible sum of the contiguous subarray.

 */

public class LargestSumOfContiguousSubArray {
    public static void main(String[] args) {
        //int arr[]= new int[]{1, 2, 3, 4, -10};
        int arr[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            System.out.println("curSum:"+ curSum);
            if(curSum > maxSum){
                System.out.println("curSum::"+ curSum + "maxSum::" + maxSum);
                maxSum = curSum;
                System.out.println("maxSum:::"+maxSum);
            }
            if(curSum < 0){
                curSum =0;
            }

        }
        System.out.println(maxSum);
    }

}
