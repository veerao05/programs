package com.arrays.easy;

import java.util.HashSet;
import java.util.Set;
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true

Space complexity :
Time complexity:o(n)
 */
import java.util.regex.Pattern;
public class ContainsDuplicates {
    public static boolean ContainDuplicate(int arr[]){
        Set<Integer> set =new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(set.contains(arr[i])){
                return  true;
            }
            set.add(arr[i]);
        }
        return false;
    }



    public static void main(String[] args) {

       System.out.println(ContainDuplicate(new int[]{1,2,3,1}));
    }
}
