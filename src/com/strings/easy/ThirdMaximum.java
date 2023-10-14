package com.strings.easy;

import java.util.Iterator;
import java.util.TreeSet;

/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Space complexity:
Time complexity:

 */
public class ThirdMaximum {


    public static int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> itr = set.iterator();
        Integer value = 0;

        for (int i = 0; itr.hasNext(); i++) {
            value = itr.next();
            if (i == set.size() - 3) {
                return value;
            }

        }
        return value;
    }


    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3,2,1}));
    }
}
