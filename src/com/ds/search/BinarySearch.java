package com.ds.search;

/* Time complexity : o(logn)
Space complexity : o(1)
*/
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = new int[]{5,7,2,1,9,5};
        int index=binarySearch(arr,9);
        System.out.println("Element found at this index"+index);
    }

    private static int binarySearch(int[] arr, int ele) {

        int start =0 ;
        int end=arr.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            if(ele == arr[mid]){
                return mid;
            }
            else if(ele > arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}
