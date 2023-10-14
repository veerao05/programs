package com.arrays.top50;

import java.util.Arrays;
/*
Minimum Number of Platforms Required for a Railway/Bus Station
Time Complexity: O(N * log N), One traversal O(n) of both the array is needed after sorting O(N * log N).
Auxiliary space: O(1), As no extra space is required.
 */
public class MinimumPlatformsForRailywayStation {
    public static void main(String[] args) {
        int  arr[] = new int[]{900, 940, 950, 1100, 1500, 1800}, dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count =0;
        int minimumPlatform=0;
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                count++;
                minimumPlatform=Math.max(minimumPlatform,count);
                i++;
            }
            else if (arr[i]> dep[j]){
                count--;
                j++;
            }

        }
        System.out.println("Minimum Platform::"+minimumPlatform);
    }
}
