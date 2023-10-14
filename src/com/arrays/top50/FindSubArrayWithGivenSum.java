package com.arrays.top50;
/*
Find subarray with given sum using Nested loop
Time Complexity: O(N2), Trying all subarrays from every index, used nested loop for the same
Auxiliary Space: O(1).
 */
public class FindSubArrayWithGivenSum {
    static  void subArraySum(int arr[], int n, int sum)
    {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
            if (currentSum == sum) {
                System.out.println("Sum found at indexe "
                        + i);
                return;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return;
                    }
                }
            }
            }
        System.out.println("No subarray found");
        return;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5}, sum = 33;
        int n=arr.length;
        subArraySum(arr,n,sum);
    }
}
