package com.arrays.easy;

import java.util.Arrays;

/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Time complexity : o(n2)
Space complexity : o(1) - only 1 new variable was created


 */
public class MoveZeros {
    /*Traditional approach */
    public  static  void moveZeroes(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++)
            if(nums[i]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;

            }
        }

        Arrays.stream(nums).forEach(e-> System.out.println(e+ " "));
    }


    public  static  void moveZeroesV2(int[] nums) {
        int count = 0;
        for(int i=0;i<=nums.length-1;i++){

                if(nums[i]==0){
                   count++;

                }
            else if (count >0){
                    nums[i-count]=nums[i];
                    nums[i]=0;


                }
        }

        Arrays.stream(nums).forEach(e-> System.out.println(e+ " "));
    }
    public static void main(String[] args) {
        moveZeroesV2(new int[]{0,1,0,3,12});
    }
}
