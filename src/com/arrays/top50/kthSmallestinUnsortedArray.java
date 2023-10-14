package com.arrays.top50;

import java.util.Arrays;

public class kthSmallestinUnsortedArray {
    public static void main(String[] args) {
        int arr[]={ 12, 3, 5, 7, 19 };
        Arrays.sort(arr);
        int k=1;
        System.out.println("Second Smallest Element::"+arr[k-1]);
    }
}
