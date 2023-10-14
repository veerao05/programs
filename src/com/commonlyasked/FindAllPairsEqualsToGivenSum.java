package com.commonlyasked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find all pairs of elements in Java array whose sum is equal to a given number
public class FindAllPairsEqualsToGivenSum {
    public static void main(String[] args) {
        int arr[]=new int[]{15,12,4,16,9,8,24,0};
        int sum=24;
        List<Integer> result= new ArrayList();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])== sum && i!=j){
                    System.out.println(arr[i]+", "+arr[j]);
                    result.add(i);
                    result.add(j);

                }
            }
        }
        Arrays.stream(result.toArray()).forEach(System.out::println);
    }

}
