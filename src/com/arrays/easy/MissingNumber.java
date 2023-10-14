package com.arrays.easy;

public class MissingNumber {
    public static int  MissingNo(int[] arr){
        int actualsum = 0;
        int expectedSum = (arr.length * (arr.length + 1)) / 2;
        for(int i=0;i<arr.length;i++){
            actualsum+=arr[i];
        }
        return expectedSum-actualsum;

    }
    public static void main(String[] args) {
        System.out.println(MissingNo(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
