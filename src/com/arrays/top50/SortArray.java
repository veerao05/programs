package com.arrays.top50;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        Integer arr[]= {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
        //Arrays.sort(Arrays.stream(arr).boxed().toArray(),Collections.reverseOrder());
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
