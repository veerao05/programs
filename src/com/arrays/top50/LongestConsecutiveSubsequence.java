package com.arrays.top50;

import java.util.Arrays;
/*
Longest Consecutive Subsequence
Time Complexity: O(NlogN): Due to the sorting step, while the subsequent traversal of the sorted array only requires O(N) time.
Space Complexity: O(1): No extra space is being used.
 */
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,1,2,3};
        int N = arr.length;
        if(N==1){
            System.out.println("Longest Consecutive subsequence: 1");
            return;
        }
        Arrays.sort(arr);
        int count=1;
        int maxCount=-1;
        for(int i=0;i<N-1;i++){
            if(arr[i+1]-arr[i]==1){
                count++;
            }else if (arr[i+1]-arr[i]==0) {
                continue;
            }
            else {
                count=1;
            }
            maxCount=Math.max(maxCount,count);

        }
        System.out.println("Longest Consecutive subsequence: "+maxCount);
    }
}
