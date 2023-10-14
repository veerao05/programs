package com.arrays.top50;

import java.util.Arrays;
/*
Chocolate Distribution Problem - Based on slinding algorithm
Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
Output: Minimum Difference is 2
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Time complexity: O(N*log(N))
Space complexity: O(1)
https://www.youtube.com/watch?v=50nn3bA1BT4
 */
public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[]=new int[]{7, 3, 2, 4, 9, 12, 56};
        int m=3;
        System.out.println(findChocolate(arr,m));
    }

    // arr[0..n-1] represents sizes of
    // packets. m is number of students.
    // Returns minimum difference between
    // maximum and minimum values of
    // distribution.
    private static int findChocolate(int[] arr, int m) {
        int n=arr.length;
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;

        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;

        // Find the subarray of size m such that difference between last (maximum in case of
        // sorted) and first (minimum in  case of sorted) elements of subarray is minimum.
        for(int i=0;i<=n-m;i++){
            int minw=arr[i];
            int maxw=arr[i+m-1];
            int diff = maxw - minw;
            if(diff<ans){
                ans=diff;
            }
        }
        return ans;
    }
}
