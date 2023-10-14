/*

Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.


Example 1:

Input:
S = "aabacbebebe", K = 3
Output: 7
Explanation: "cbebebe" is the longest
substring with K distinct characters.
Example 2:

Input:
S = "aaaa", K = 2
Output: -1
Explanation: There's no substring with K
distinct characters.

Your Task:
You don't need to read input or print anything. Your task is to complete the function longestKSubstr() which takes the string S and
an integer K as input and returns the length of the longest substring with exactly K distinct characters.
If there is no substring with exactly K distinct characters then return -1.

Time complexity :
Space complexity:

pseudocode :


 */
package com.concepts.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinctCharacters {
    public static int longestSubString(String s , int k){
        int i=0,j=0;
        int max=-1;
        Map<Character,Integer> map =new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.size() > k){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                if(map.get(s.charAt(i))==0){
                   map.remove(s.charAt(i));
                }
                i++;
            }
            if(map.size()==k){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return  max;
    }



    public static void main(String[] args) {
        String s ="aaaa";
        System.out.println( longestSubString(s,3));

    }
}
