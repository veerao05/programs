package com.strings.easy;

import java.util.HashMap;
import java.util.Map;
/* JewelsAndStones
Time complexity  :o(n)
Space complexity : o(1)
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : stones.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : jewels.toCharArray()) {
            result += map.getOrDefault(ch, 0);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
