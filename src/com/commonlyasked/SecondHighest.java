package com.commonlyasked;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,2,1,9,7};
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>highest){
                secondHighest=highest;
                highest=i;
            }
            else if(i>secondHighest){
                secondHighest=i;
            }
        }
        System.out.println("Highest"+highest + "second Highest::"+secondHighest);
    }
}
