package com.strings.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Time complexity
Space complexity
 */

public class FirstUniqueCharInString {
    /*using bruteforce */
    public static int firstUniqCharV2(String s) {
        char[] arr = s.toCharArray();//loveleetcode
        int index=-1;
        for (int i = 0; i <= arr.length - 1; i++) {
            boolean repetative=false;

            System.out.println("i:: " + arr[i]);
            for (int j = i + 1; j <= arr.length - 1; j++) {
                System.out.println("j:: " + arr[j]);
                if (arr[j] == arr[i]) {
                    repetative=true;
                    break;
                }


            }
            if(!repetative){
                index=i;
                return index;

            }



        }
        return index;
    }

    /* using hashmap*/
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int index = -1;
        char[] arr = s.toCharArray();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], -1);
            } else {
                map.put(arr[i], i);//1 2 ove
            }
        }

        //map.getOrDefault(key,default_value)
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != -1) {
                index = entry.getValue();
                return index;

            }
        }

        return index;
    }

    public static void main(String[] args) {
        int result = firstUniqCharV2("loveleetcode");
        System.out.println(result);
    }
}
