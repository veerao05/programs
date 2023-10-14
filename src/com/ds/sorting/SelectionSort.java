package com.ds.sorting;

import java.util.Arrays;

/*
Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element
from the unsorted portion of the list and moving it to the sorted portion of the list.
Time complexity : o(n2)
Space complexity : o(1)
Name	        Best Case  	Average Case  	Worst Case 	Memory	Stable   	Method Used
Selection Sort	n^{2}	    n^{2}	        n^{2}	    1	    No	         Selection
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = selectionSort(new int[]{64, 34, 25, 12, 22, 11, 90});
        System.out.println("The sorted Array is ::"+ Arrays.toString(arr));
    }

    private static int[] selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int smallEle=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<smallEle){
                    int temp=smallEle;
                    smallEle=arr[j];
                    arr[j]=temp;
                }
            }
        }
    return arr;
    }
}
