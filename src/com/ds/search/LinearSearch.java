package com.ds.search;

/* Time complexity : o(n)
Space complexity : o(1)
 */
public class LinearSearch {

    public static int linearSearch(int arr[], int ele)
    {
        for(int i=0;i<arr.length;i++){
            if(ele == arr[i]){
                return i;
            }
        }
        return -1;
    }    public static void main(String[] args) {
        int arr[] = new int[]{5,7,2,1,9,5};
        int index=linearSearch(arr,9);
        System.out.println("Element found at this index"+index);
    }
}
