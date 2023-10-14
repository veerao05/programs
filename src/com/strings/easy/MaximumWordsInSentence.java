package com.strings.easy;
/* MaximumWordsInSentence
Time complexity  :o(n)
Space complexity : o(1)
 */
public class MaximumWordsInSentence {
    public static int mostWordsFound(String[] sentences) {
        int count;
        int max = Integer.MIN_VALUE;
        for (String word : sentences) {
            count = word.split(" ").length;
            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String str[] = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));
    }
}
