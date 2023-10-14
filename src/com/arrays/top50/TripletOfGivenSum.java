package com.arrays.top50;

import java.util.HashSet;

/*

Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples:

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
Output: 12, 3, 9
Explanation: There is a triplet (12, 3 and 9) present
in the array whose sum is 24.
Input: array = {1, 2, 3, 4, 5}, sum = 9
Output: 5, 3, 1
Explanation: There is a triplet (5, 3 and 1) present
in the array whose sum is 9.
Method 4: This is a Hashing-based solution.

Approach: This approach uses extra space but is simpler than the two-pointers approach. Run two loops outer loop from start to end and inner loop from i+1 to end. Create a hashmap or set to store the elements in between i+1 to n-1. So if the given sum is x, check if there is a number in the set which is equal to x – arr[i] – arr[j]. If yes print the triplet.

Algorithm:
Traverse the array from start to end. (loop counter i)
Create a HashMap or set to store unique pairs.
Run another loop from i+1 to end of the array. (loop counter j)
If there is an element in the set which is equal to x- arr[i] – arr[j], then print the triplet (arr[i], arr[j], x-arr[i]-arr[j]) and break
Insert the jth element in the set.
Time complexity: O(N^2)
Auxiliary Space: O(N), since n extra space has been taken

https://www.youtube.com/watch?v=jaJQ-De201Y
 */
public class TripletOfGivenSum {
    static boolean find3Numbers(int A[],
                                int arr_size, int sum)
    {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                System.out.println(s);
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + (curr_sum - A[j]));
                    return true;
                }
                s.add(A[j]);
                System.out.println(s);
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        find3Numbers(A, arr_size, sum);
    }
}
