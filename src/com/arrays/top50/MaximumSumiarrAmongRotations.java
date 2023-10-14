package com.arrays.top50;
/*
Maximum sum of i*arr[i] among all rotations of a given array
Method 1: This method discusses the Naive Solution which takes O(n2) amount of time.
The solution involves finding the sum of all the elements of the array in each rotation and then deciding the maximum summation value.

Approach:A simple solution is to try all possible rotations. Compute sum of i*arr[i] for every rotation and return maximum sum.
Algorithm:
Rotate the array for all values from 0 to n.
Calculate the sum for each rotations.
Check if the maximum sum is greater than the current sum then update the maximum sum.

Time Complexity : O(n2)
Auxiliary Space : O(1)
 */
public class MaximumSumiarrAmongRotations {
    public static void main(String[] args) {
        int arr[]= {8, 3, 1, 2};
        System.out.println(maxSum(arr));
    }

    private static int maxSum(int[] arr) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum=0;
            for (int j = 0; j < arr.length; j++) {
                int index= (i+j)%arr.length;
                currSum+= j*arr[index];
                System.out.println("index::"+index+"currSum::"+currSum);
            }
             res= Math.max(res,currSum);
        }
           return res;
        }

}
