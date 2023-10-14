package com.misc;

public class IGGroupWrittenTest2 {
    public static boolean checkString(String s) {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='b'&&s.charAt(i+1)=='a')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkString("aabbb"));

    }
}
