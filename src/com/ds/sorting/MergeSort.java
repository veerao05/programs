package com.ds.sorting;

/*
Merge sort is defined as a sorting algorithm that works by dividing an array into smaller subarrays,
sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.
Time complexity : O(N log(N)),
Space complexity : O(N)
 */

public class MergeSort {
    static void merge(int[] arr,int left,int mid ,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int i,j,k;

        int[] resultLeft=new int[n1];
        int[] resultRight=new int[n2];

        for(i=0;i<n1;i++) {
            resultLeft[i]=arr[left+i];
        }
        for(j=0;j<n2;j++) {
            resultRight[j] = arr[mid + 1 + j];
        }
            i=0;
            j=0;
            k=left;

            while (i<n1 && j<n2){
                if(resultLeft[i]<=resultRight[j]){
                    arr[k] = resultLeft[i];
                    i++;
                }
                else {
                    arr[k] = resultRight[j];
                    j++;
                }
               k++;

        }
            while(i<n1){
                arr[k]=resultLeft[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=resultRight[j];
                j++;
                k++;
            }
    }

    static void sort(int arr[],int l,int r)
    {
        int mid;
        if(l<r){
             mid =( l + r) / 2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }


    public static void main(String[] args) {
        int[] a = {12, 8, 4, 14, 36, 64, 15, 72, 67, 84};

        int size = a.length;
        display(a, size);

        sort(a, 0, size - 1);
        display(a, size);

    }

    private static void display(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}