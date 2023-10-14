package com.commonlyasked;

public class Palindrome {
    public static void main(String[] args) {
        String original="mom";
        String reverse="";
        for(int i= original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        System.out.println(original);
        System.out.println(reverse);
        if(original.equals(reverse)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
