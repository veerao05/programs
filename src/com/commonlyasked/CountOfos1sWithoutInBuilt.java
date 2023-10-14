package com.commonlyasked;

import java.util.Arrays;

public class CountOfos1sWithoutInBuilt {
    public static void main(String[] args) {
        int arr[]=new int[]{1,1,0,1,0,1,1,0};
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("count of 1's::"+sum);
        System.out.println("count of 0's::"+(arr.length-sum));

    }
}
