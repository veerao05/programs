package com.commonlyasked;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static void main(String[] args) {
        String str="abcdABCDabcd";
        char[] chArray=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch: chArray){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

    }
}
