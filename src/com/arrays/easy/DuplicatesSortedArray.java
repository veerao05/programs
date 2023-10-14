package com.arrays.easy;

/*Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
Custom Judge:
The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length
int k = removeDuplicates(nums); // Calls your implementation
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
Space complexity :
Time complexity :
*/

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));

        Iterator<Integer> itr = set.iterator();
        for (int i = 0; itr.hasNext(); i++) {
            nums[i] = itr.next();
       }
        Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
        return set.size();
    }
    public static void main(String[] args) {
        //System.out.println(removeDuplicates(new int[]{-3,-1,0,0,0,3,3}));
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 6, 3, 6, 1}));
    }
}

