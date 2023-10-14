package com.arrays.top50;

import java.util.Arrays;

/*
\    /\    /\    /
 \  /  \  /  \  /
  \/    \/    \/
Sort an array in wave form

Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted in wave form if:
arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

Examples:

Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
Explanation:
here you can see {10, 5, 6, 2, 20, 3, 100, 80} first element is larger than the second and
the same thing is repeated again and again. large element – small element-large element -small element and so on .
it can be small element-larger element – small element-large element -small element too.
all you need to maintain is the up-down fashion which represents a wave. there can be multiple answers.

A idea is to use sorting. First sort the input array, then swap all adjacent elements.

Follow the steps mentioned below to implement the idea:

Sort the array.
Traverse the array from index 0 to N-1, and increase the value of the index by 2.
While traversing the array swap arr[i] with arr[i+1].
Print the final array.

Time Complexity: O(N*log(N))
Auxiliary Space: O(1)
 */
public class waveArray {
    public static void main(String[] args) {

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        sortInWave(arr, n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    static void swap(int[] arr,int i,int j){
       int  temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
     static void sortInWave(int[] arr, int n) {

        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
            swap(arr,i,i+1);
        }
    }
}

