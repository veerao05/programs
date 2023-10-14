package com.arrays.top50;
/*
Given an array that contains both positive and negative integers, find the product of the maximum product subarray.
Time Complexity: O(N2)
Auxiliary Space: O(1)
 */
public class MaximumProductContinousSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }

    private static int maxSubarrayProduct(int[] arr) {
        int result=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int mul=arr[i];
            for(int j=i+1;j<n;j++){
                result = Math.max(result,mul);
                mul*=arr[j];
            }
            result =  Math.max(result,mul);
    }
        return result;
}
}
