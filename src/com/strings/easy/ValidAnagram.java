package com.strings.easy;

import java.util.HashMap;
import java.util.Map;

/*
Time complexity
Space complexity
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(Character ch :s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character ch: t.toCharArray()){
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else {
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return  false;
            }

        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
