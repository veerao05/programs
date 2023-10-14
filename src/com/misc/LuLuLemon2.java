package com.misc;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LuLuLemon2 {
    public static void main(String[] args) {
       int[] arr= new int[]{1,2,4,6,7};

       //sum of odd and even 8 12
        //Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()
        System.out.println(Arrays.stream(arr).mapToObj(ob -> Integer.valueOf(ob)).collect(Collectors.groupingBy(t-> t%2 == 0 ?"ODD" : "EVEN")));
        Arrays.stream(arr).boxed().filter(v -> v % 2 == 0)
                .collect(Collectors.summingInt(Integer::intValue));

        Arrays.stream(arr).boxed()
                .filter(v -> v % 2 == 0).mapToInt(Integer::intValue).sum();

        Map<String, Integer> map1 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e % 2 == 0 ? "OddSum" : "EvenSum", Collectors.summingInt(Integer::intValue)));
        System.out.println("map11::"+map1);




    }
}
