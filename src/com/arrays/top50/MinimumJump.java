package com.arrays.top50;
/*
Jump Game
The task is to find the minimum number of jumps to reach the end of the array starting from index 0.
Approach : Greedy Algorithm
Time complexity :o(n)
Space complexity : o(1)
 */
public class MinimumJump {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJump(arr));
    }

    private static int minJump(int[] arr) {
        int n=arr.length;
        int farthest = 0;
        int current =0; // current position we are in . Iterate till current position to know which is optimal solution
        int jump=0;
        for(int i=0;i<n;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i == current)// if we have exhausted/ reached all the paths. we need to start of maxReachable
            {
                current=farthest;
                jump++;
            }

        }
        return jump;
    }
}
