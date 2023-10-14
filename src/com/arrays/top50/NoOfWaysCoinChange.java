package com.arrays.top50;
/*
Given an integer array of coins[ ] of size N representing different types of denominations and an integer sum,
the task is to find the number of ways to make sum by using different denominations.

Note: Assume that you have an infinite supply of each type of coin.

Examples:

Input: sum = 4, coins[] = {1,2,3},
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.

https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/CoinChanging.java

We can use the following steps to implement the dynamic programming(tabulation) approach for Coin Change.

Create a 2D dp array with rows and columns equal to the number of coin denominations and target sum.
dp[0][0] will be set to 1 which represents the base case where the target sum is 0, and there is only one way to
make the change by not selecting any coin.

Iterate through the rows of the dp array (i from 1 to n), representing the current coin being considered.
The inner loop iterates over the target sums (j from 0 to sum).

Add the number of ways to make change without using the current coin, i.e., dp[i][j] += dp[i-1][j].
Add the number of ways to make change using the current coin, i.e., dp[i][j] += dp[i][j-coins[i-1]].

dp[n][sum] will contain the total number of ways to make change for the given target sum using the available coin denominations
Time complexity  :
Space complexity :
 */
public class NoOfWaysCoinChange {
    public static int numberOfSolutions(int total, int coins[]){
        int temp[][] = new int[coins.length+1][total+1];
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= total ; j++){
                if(coins[i-1] > j){
                    temp[i][j] = temp[i-1][j];
                }
                else{
                    temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
                }
            }
        }
        return temp[coins.length][total];
    }

    public static void main(String[] args) {

        int total = 5;
        int coins[] = {1,2,3};
        System.out.println(numberOfSolutions(total, coins));
    }
}
