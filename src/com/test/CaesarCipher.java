package com.test;


/*
Caesar Cipher algorithm
Input : cipher(“bcd”, 1)
Output : abc */

public class CaesarCipher {
    static String cipherV2(String word, int count) {
        String initialString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] res = word.toCharArray();
        String result = "";
        for (int i = 0; i <= res.length - 1; i++) {
            int position = initialString.toLowerCase().indexOf(res[i]);
            int encryptPosition = (position + count) % 26;
            result += initialString.toLowerCase().charAt(encryptPosition);
        }
        return result;
    }

    /*Time complexity : for loop o(n)*/

    static String deCryptCipher(String word, int count) {
        char[] res = word.toCharArray();
        String initialString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for (int i = 0; i <= res.length - 1; i++) {
            int position = initialString.toLowerCase().indexOf(res[i]);
            int encryptPosition = (position - count) % 26;
            //char resultChar = initialString.toLowerCase().charAt(encryptPosition);
             if (encryptPosition < 0){
                 encryptPosition = initialString.toLowerCase().length() + encryptPosition;
             }
            char resultChar = initialString.charAt(encryptPosition);
            result += resultChar;


        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(deCryptCipher("abc", 1));
    }
}

