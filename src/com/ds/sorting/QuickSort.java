package com.ds.sorting;

/*
Time complexity:
Space complexity:
Worst Case:when the pivot element is always the smallest or the largest element.if the elements are in sorted order asc or desc

 */
public class QuickSort {

    static void quicksort(int arr[],int low,int high){
        int pivot;
        if(low<high){
            pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);// to sort elements<pivot
            quicksort(arr,pivot+1,high);// to sort elements>pivot
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;//no elements less than pivot
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //elements< pivot will be placed in left side
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;// pivot requires empty position to be added.
        //now placing pivot element in right position
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot index
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{6,3,9,5,2,8};
        quicksort(arr,0,arr.length-1);
        display(arr);

    }
}
