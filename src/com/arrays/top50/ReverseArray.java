package com.arrays.top50;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6};
        reverseArray(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

     static void reverseArray(int[] arr,int start,int end) {
        int temp;
        if(start>=end)return;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr,start+1,end-1);

    }
}
