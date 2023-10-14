package com.strings.easy;

/* Removal vowels from string
Time complexity  :o(n)
Space complexity : o(1)
 */
public class RemovalVowelsFromString {
    static String VowelsRemovalFromString(String result) {
        char[] ch = result.toLowerCase().toCharArray();
        StringBuilder result1 = new StringBuilder();
        StringBuilder notVowel = new StringBuilder();

        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result1.append(c);
            } else {
                notVowel.append(c);
            }
        }
        return notVowel.toString();
    }

    public static void main(String[] args) {
        String str = VowelsRemovalFromString("avaHungry");
        System.out.println(str);
    }
}
