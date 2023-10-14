package com.arrays.top50;

import java.util.ArrayList;
import java.util.Arrays;
/*
Intuition
The main idea behind this code is to rearrange the elements of the input array in a specific pattern: positive numbers followed by negative numbers, while maintaining their relative order. The rearranged array alternates between positive and negative numbers.

Approach
Separating Positive and Negative Numbers:
The first loop iterates through each element in the input array nums. It separates the positive numbers from the negative numbers and stores them in two separate ArrayLists, listP for positive numbers and listN for negative numbers. This separation is achieved by checking the sign of each number and adding it to the respective ArrayList.

Reconstructing the Array with Alternating Pattern:
The second loop iterates through the entire nums array. For each position i in the array, it uses an alternating pattern to reconstruct the array. If i is an even index (0-based), it takes the next positive number from listP and places it at position i in the nums array. If i is an odd index, it takes the next negative number from listN and places it at position i in the nums array.

Maintaining Relative Order:
Since the numbers are taken from listP and listN in the order they appear in those ArrayLists, the relative order of positive and negative numbers is preserved. This ensures that the rearranged array follows the desired pattern of alternating positive and negative numbers.

Complexity
Time complexity: O(n)
Space complexity: O(n)
 */
public class ReArrangePositiveNegativeAlternative {
    public  static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> listP = new ArrayList<>();
        ArrayList<Integer> listN = new ArrayList<>();

        for(int i : nums){
            if(i > 0){
                listP.add(i);
            } else{
                listN.add(i);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = listP.get(i/2);
            }else{
                nums[i] = listN.get(i/2);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[]=rearrangeArray(new int[]{-5, 3, 4, 5, -6,-2, 8, 9, -1, -4});
        Arrays.stream(nums).boxed().forEach(System.out::println);
    }
}
