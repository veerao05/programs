package com.arrays.medium;

/* Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
url : https://leetcode.com/problems/daily-temperatures/

Time complexity  : o(n2)
Space complexity : o(n)
*/


import java.util.Arrays;

public class DailyTempature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int result[]=new int[temperatures.length];

        for (int i=0;i<=temperatures.length-1;i++){
            for(int j=i+1;j<=temperatures.length-1;j++){
               if(temperatures[i]<temperatures[j]){
                  result[i]= j-i;
                  break;
               }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int dailyTemperatures[] = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int result[] = dailyTemperatures(dailyTemperatures);
        Arrays.stream(result).forEach(e-> System.out.println(e+ " "));
    }
}
