package com.commonlyasked;

public class StringReverse {
    public static void main(String[] args) {
        //Reverse a word
        String word="Hello";
        for(int i=word.toCharArray().length-1;i>0;i--){
            System.out.println(word.toCharArray()[i]);
        }

        //reverse a sentence
        String str="Hello today is expiry";
        String[] arr=str.split(" ");
        String result="";
        for(int i=arr.length-1;i>=0;i--){
            result+=arr[i] + " ";
        }
        System.out.println(result);

    }
}
