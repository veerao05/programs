package com.commonlyasked;

/*
In the above approach it can be seen that dp[i] only depends on previous states.
We can optimize the space complexity of the dynamic programming solution to O(1) by using only two variables prev1 and prev2
to keep track of the previous two values of dp[i-1] and dp[i-2]. Since we only need these two values to calculate the next value,
 we don’t need to store the entire array.
Time Complexity: O(N)
Auxiliary Space: O(1)
 */
public class CountWayToReachNStair {
    static int countWays(int n)
    {
        // declaring  two variables to store the count
        int prev = 1;
        int prev2 = 1;
        // Running for loop to count all possible ways
        for (int i = 2; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of Ways : "
                + countWays(n));

    }
}
