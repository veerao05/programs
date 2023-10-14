package com.arrays.top50;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
i/p1 : [3,2,3]

i/p2 :[2,2,1,1,1,2,2]
 */



public class MajorityElementNBy2 {

    public static  void test(){
        //occurrence of elements
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        HashMap<String,Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);



    }
    public static void main(String[] args) {
        /*int arr[]=new int[]{2,2,1,1,1,2,2};
        Map<Integer,Integer> map =new HashMap<>();
        for(int element:arr){
            if(!map.containsKey(element)){
                map.put(element,1);
            }
            else {
                map.put(element,map.get(element)+1);
            }

        }
        System.out.println(map);
        int size = arr.length /2;
        System.out.println(size);
        for(Map.Entry ele : map.entrySet()){
            if((int) ele.getValue() > size){
                System.out.println("Majority element::"+ele.getKey());
            }
        }*/


    }
}
