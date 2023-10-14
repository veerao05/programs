package com.strings.easy;

import java.util.Arrays;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Time complexity :
Space complexity :
 */
public class IndexFirstOccurrence {
    public static int strStr(String haystack, String needle) {

        int needLength = needle.length();
        if(haystack.length()==needle.length()){
            if(haystack.equals(needle)){
                return  0;
            }

        }
        for(int i=0;i<haystack.length()-needLength;i++){
            if(haystack.substring(i,i+needLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("leetcode","leeto"));
    }
}
