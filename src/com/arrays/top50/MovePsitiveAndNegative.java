package com.arrays.top50;

import java.util.Arrays;

/*
Move all negative numbers to beginning and positive to end with constant extra space
Two Pointer Approach
Two Pointer Approach: The idea is to solve this problem with constant space and linear time is by using a two-pointer or two-variable approach where we simply take two variables like left and right which hold the 0 and N-1 indexes. Just need to check that :

Check If the left and right pointer elements are negative then simply increment the left pointer.
Otherwise, if the left element is positive and the right element is negative then simply swap the elements, and simultaneously increment and decrement the left and right pointers.
Else if the left element is positive and the right element is also positive then simply decrement the right pointer.
Repeat the above 3 steps until the left pointer ? right pointer.
o/p
-12 -3 -13 -5 -7 6 5 11 11
This is an in-place rearranging algorithm for arranging the positive and negative numbers where the order of elements is not maintained.
Time Complexity: O(N)
Auxiliary Space: O(1)
 */
public class MovePsitiveAndNegative {
    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };
        shiftAll(arr, 0, arr.length - 1);
        Arrays.stream(arr).boxed().forEach(System.out::println);

    }

     static void shiftAll(int[] arr, int left, int right) {
        while (left<=right){
            if(arr[left]<0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(arr[left]>0 && arr[right]>0){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
    }
}
