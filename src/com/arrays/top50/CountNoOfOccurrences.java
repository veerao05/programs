package com.arrays.top50;

/*
Count number of occurrences (or frequency) in a sorted array
Time Complexity: O(n)
Space Complexity: O(1), as no extra space is used
 */
public class CountNoOfOccurrences {
    static int countOcuurences(int arr[],int searchValue){
        int count=0;
        for(int val : arr){
            if(searchValue == val){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
       int  arr[] = {1, 1, 2, 2, 2, 2, 3,};
       int value=2;
        System.out.println(countOcuurences(arr,value));

    }
}
