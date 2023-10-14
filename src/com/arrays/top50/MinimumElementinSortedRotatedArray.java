package com.arrays.top50;
/*
Minimum element in a Sorted and Rotated Array
Time Complexity: O(N)
Auxiliary Space: O(1)
 */
public class MinimumElementinSortedRotatedArray {
    static int  findMinimum(int[] arr,int n){
        int minElement=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<minElement){
                minElement=arr[i];
            }
        }
        return minElement;

    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 2, 3, 4 };
        int N = arr.length;
        System.out.println(findMinimum(arr, N));
    }
}
