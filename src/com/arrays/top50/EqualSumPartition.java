package com.arrays.top50;

import java.util.Arrays;

/*
Partition problem
The partition problem is to determine whether a given set can be partitioned into two subsets such that
the sum of elements in both subsets is the same.

Examples:

Input: arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}

Input: arr[] = {1, 5, 3}
Output: false
The array cannot be partitioned into equal sum sets.
Knapsnack problem -> subset problem -> EqualSum partition

https://www.techiedelight.com/partition-problem/
https://www.youtube.com/watch?v=UGY7FMHt-M8
 */
public class EqualSumPartition {
    // Returns true if there exists a subarray of array `nums[0…n]`
    // with the given sum
    public static boolean subsetSum(int[] nums, int n, int sum)
    {
        // return true if the sum becomes 0 (subset found)
        if (sum == 0) {
            return true;
        }

        // base case: no items left or sum becomes negative
        if (n < 0 || sum < 0) {
            return false;
        }

        // Case 1. Include the current item `nums[n]` in the subset and recur
        // for remaining items `n-1` with the remaining total `sum-nums[n]`
        boolean include = subsetSum(nums, n - 1, sum - nums[n]);

        // return true if we get subset by including the current item
        if (include) {
            return true;
        }

        // Case 2. Exclude the current item `nums[n]` from the subset and recur for
        // remaining items `n-1`
        boolean exclude = subsetSum(nums, n - 1, sum);

        // return true if we get subset by excluding the current item
        return exclude;
    }

    // Returns true if given array `nums[0…n-1]` can be divided into two
    // subarrays with equal sum
    public static boolean partition(int[] nums)
    {
        int sum = Arrays.stream(nums).sum();

        // return true if the sum is even and the array can be divided into
        // two subarrays with equal sum
        return (sum & 1) == 0 && subsetSum(nums, nums.length - 1, sum/2);
    }

    public static void main(String[] args)
    {
        // Input: a set of items
        int[] nums = { 1, 5, 11, 5 };

        if (partition(nums)) {
            System.out.println("Set can be partitioned");
        }
        else {
            System.out.println("Set cannot be partitioned");
        }
    }
}
