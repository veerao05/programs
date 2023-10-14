package com.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IGGroupWrittenTest {


    public static void main(String[] args) {
        int arr1[]={23,5,2,7,87};
        int arr2[]={4,67,2,8};
        int[] res = solution(arr1,arr2);
        Arrays.stream(res)
                .forEach(e->System.out.print(e + " "));
    }



    private static int[] solution(int[] arr1, int[] arr2) {
       /* int length = arr1.length < arr2.length ? arr1.length : arr2.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;*/

        int minSize = Math.min(arr1.length, arr2.length);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            int sum = arr1[i] + arr2[i];

            if (sum >= 10) {
                // If the sum is a two-digit number, split it into individual digits
                resultList.add(sum / 10); // Store the leftmost digit of the sum
                resultList.add(sum % 10); // Store the rightmost digit of the sum
            } else {
                resultList.add(sum);
            }
        }

        // Handle the remaining elements of the longer array, if any
        for (int i = minSize; i < arr1.length; i++) {
            if (arr1[i] >= 10) {
                resultList.add(arr1[i] / 10);
                resultList.add(arr1[i] % 10);
            } else {
                resultList.add(arr1[i]);
            }
        }

        for (int i = minSize; i < arr2.length; i++) {
            if (arr2[i] >= 10) {
                resultList.add(arr2[i] / 10);
                resultList.add(arr2[i] % 10);
            } else {
                resultList.add(arr2[i]);
            }
        }

        // Convert the List to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;

    }

    }

