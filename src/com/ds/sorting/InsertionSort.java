package com.ds.sorting;

import java.sql.SQLException;
import java.util.Arrays;

/*
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.

Time complexity : o(n2)
Space complexity : o(1)
Name	     Best Case  	Average Case  	Worst Case 	Memory	Stable   	Method Used
Bubble Sort	 n	            n^{2}	        n^{2}	    1       Yes	          Exchanging
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = insertionSort(new int[]{64, 34, 25, 12, 22, 11, 90});
        System.out.println("The sorted Array is ::"+ Arrays.toString(arr));
    }

    private static int[] insertionSort(int[] arr) {
        for(int i=1;i<arr.length ;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
        return arr;
    }
}
