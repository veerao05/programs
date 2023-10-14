package com.ds.sorting;

import java.util.Arrays;

/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
Time complexity : o(n2)
Space complexity : o(1)
Name	     Best Case  	Average Case  	Worst Case 	Memory	Stable   	Method Used
Bubble Sort	 n	            n^{2}	        n^{2}	    1       Yes	          Exchanging
 */
public class BubbleSort {
    public static int[] bubbleSort(int arr[]){
        boolean swapped;
        int temp;
        for(int i=0;i<arr.length-1;i++){
            swapped  =false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                if(swapped ==false){
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = bubbleSort(new int[]{64, 34, 25, 12, 22, 11, 90});
        System.out.println("The sorted Array is ::"+ Arrays.toString(arr));
    }
}
