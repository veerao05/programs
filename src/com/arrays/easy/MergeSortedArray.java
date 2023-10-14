package com.arrays.easy;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Time complexity  :
Space complexity :
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] res =new int[nums1.length];
        while(i < m && j < n){
            if(nums1[i]<=nums2[j]) {
                res[k++]=nums1[i++];
            }
            else
            {
                res[k++]=nums2[j++];
            }
        }
        while (i<m){
            res[k++]=nums1[i++];
        }
        while (j<n){
            res[k++]=nums2[j++];
        }
        System.arraycopy(res, 0, nums1, 0, res.length);
        for (int num : nums1) {
            System.out.println(num);
        }

    }
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
