package com.strings.easy;

/*The goal of this coding exercise is to write a Caesar cipher.
In cryptography, a Caesar cipher, also known as Caesar's cipher, Caesar's code or Caesar shift, is one of the simplest and
most widely known encryption techniques.
It is a type of substitution cipher in which each letter in the plaintext is replaced
by a letter some fixed number of positions down the alphabet. (Left Shifting)
For example, with a left shift of 3, D would be replaced by A, E would become B, and so on.
The method is named after Julius Caesar, who used it in his private correspondence.
cipher(“bcd”, 1)

Time complexity :o(n)
Space complexity :o(1)
 */
public class CipherString {
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String LeftShiftCipher(String text, int count) {

        String result = "";
        for (int i = 0; i <= text.length() - 1; i++) {
            int index = alphabet.toLowerCase().indexOf(text.toCharArray()[i]);
            int pos = (index - count) % 26;
            if (pos < 0) {
                result += alphabet.charAt(alphabet.length() + pos);
            } else {
                result += alphabet.charAt(pos);
            }
        }
        return result.toLowerCase();
    }

    public static String RightShiftCipher(String text, int count) {

        String result = "";
        for (int i = 0; i <= text.length() - 1; i++) {
            int index = alphabet.toLowerCase().indexOf(text.toCharArray()[i]);
            int pos = (index + count) % 26;
            result += alphabet.charAt(pos);
        }
        return result.toLowerCase();
    }


    public static void main(String[] args) {
        //System.out.println(RightShiftCipher("z", 1));
        System.out.println(LeftShiftCipher("ab", 1));
        String[] a =new String[10];
        String name="tom";
        a[0]=name;
        name=null;
        System.out.println("--------");
        System.out.println(name);
        System.out.println(a);

        String s="A";



    }
}
