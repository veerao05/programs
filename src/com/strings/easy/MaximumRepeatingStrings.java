package com.strings.easy;

import java.util.HashMap;

/*
For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence.
The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence.
If word is not a substring of sequence, word's maximum k-repeating value is 0.
Given strings sequence and word, return the maximum k-repeating value of word in sequence.
Example 1:
Input: sequence = "ababc", word = "ab"
Output: 2
Explanation: "abab" is a substring in "ababc".

Time complexity:o(n)
Space complexity:o(1)
 */
public class MaximumRepeatingStrings {

    public static int maxRepeatingV2(String sequence, String word) {
        int count = 0;
        for (int i = 0; i < (sequence.length() - word.length())-1; i++) {//abcabc
            if (sequence.substring(i,i+word.length()).equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static int maxRepeating(String sequence, String word) {

        String temp = word;
        int count = 0;
        while (sequence.contains(temp)) {
            temp += word;
            count++;
        }
        char[] seqArray = sequence.toCharArray();
        for (int i = 0; i < seqArray.length - 1; i++) {
            for (int j = 0; j <= word.length() - 1; j++) {
                if (sequence.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeatingV2("abctyuabc", "abc"));
    }
}

