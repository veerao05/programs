package com.arrays.top50;
/*
Find the first missing positive integer
Time complexity :
Space complexity :
https://www.youtube.com/watch?v=4VpBKinOTYA
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        System.out.println("First Missing positive number::"+firstPositiveMissingNumber(arr));
    }

    private static int firstPositiveMissingNumber(int[] arr) {
        int n=arr.length;
        // for negative numbers and out of arr length numbers do n+1(max number).n=arr.length+1 is the actual missing number
        //Missing nos range are from 1 to n+1
        //1. {3,4,-1,1}
        for(int i=0;i<n;i++){
            if(arr[i]<=0 || arr[i]>n){
                arr[i]= n+1;
            }
        }//{3,4,5,1}
        // 2. start marking the index of arr[i] as (index-1) as negative. ex : arr[0]=3 go to index 3-1=2nd index .2nd index as 5.Mark -5. which means 3 is present in the array
        //If num> n do continue
        for(int i=0;i<n;i++){
            int idx=Math.abs(arr[i]);
            if(idx>n) continue ;  //if index becomes>length of array do nothing
            idx--;
            if(arr[idx] > 0) arr[idx]=-arr[idx];

        }//{-3,4,-5,-1}
        // 3. the value which is postive will have minimum positive number . 4 at index 1 . so n+1 =1+1=2 is minimum positive number
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                return  i+1;
            }
        }
        return n+1;
    }
}
