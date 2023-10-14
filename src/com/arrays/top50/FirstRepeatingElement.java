package com.arrays.top50;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting())).entrySet()
                .stream().filter(entry -> entry.getValue() >1).map(entry -> entry.getKey()).findFirst().get());

    }
}
