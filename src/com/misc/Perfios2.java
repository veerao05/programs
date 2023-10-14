package com.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


/*
Given an unsorted integer array, A of size N. Find the first missing positive integer.
Note: Your algorithm should run in O(n) time and use constant space.
[1, 2, 0]
Output 1:
3
[3,4,-1,1]
Output: 2

[5,4,3,1]

 */
public class Perfios2 {
    public static  int wordCount(String input,String searchElement){
        Map<String,Integer> map=new HashMap<>();
        String[] inputString=input.toLowerCase().split("\\s+");
        int count=0;
        //System.out.println("inputString::"+inputString);
        //String[] words= inputString.split(" ");
        for(String str : inputString){
            if(str.equals(searchElement)){
                count++;
            }
        }
        System.out.println("SearchElement occurs::"+count);
        return  count;
    }

    public static int smallestPositiveCount(int arr[]){
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

        String input = "Working on Client project MicroFocus NOM(Network Operations Management) : The Network Operations\n" +
                "Management suite (NOM) from Micro Focus® delivers complete control of your modern network in-frastructure. This\n" +
                "proven product suite enables you to deliver the network foundation you need for your critical business services";
        System.out.println(wordCount(input,"the"));
        System.out.println("smallestPositiveCount"+smallestPositiveCount(new int[]{3,4,-1,1}));


    }
}
