package com.misc;

import java.sql.ClientInfoStatus;

/*
Nth stair



There are n stairs,
a person standing at the bottom wants to climb stairs to reach the nth stair.
The person can climb either 1 stair or 2 stairs at a time,
the task is to count the number of ways that a person can reach at the top.


Input 1 noOFStairs=2;  (1+1  2) 2 ways
Output 1 Find no of ways in which a person can reach the top

Input 2
Output 2

Input 4
Output 5

 */
public class Volcera {

    /*public static int climingStairs(int num){
        int oneStair=1, twoStair=2;
        int possibleWays=0;
        //permutation of num


        return  0;
    }*/

    static boolean palindrome (String str){

        //way 1  o(n)
        char[] charArray = str.toLowerCase().toCharArray();
        for(int i=0;i<=charArray.length-1;i++){
         if(charArray[i] == charArray[charArray.length-i-1]){
             return true;
         }
        }

         //way 2
        String reverse="";
        //o(n)
        for(int i=charArray.length-1 ;i >=0;i--){
            reverse=reverse+charArray[i];
        }
        System.out.println(reverse);
        System.out.println(str);
        if(reverse.equals(str.toLowerCase())){
            return true;
        }
        return false;


    }
    public static void main(String[] args) {

        //climingStairs(2);
        System.out.println(palindrome("MALAY ALAM"));

    }
}
