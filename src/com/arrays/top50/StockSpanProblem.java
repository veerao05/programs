package com.arrays.top50;

import java.util.Arrays;
import java.util.Stack;
/*
The stock span problem

The stock span problem is a financial problem where we have a series of N daily price quotes for a stock
and we need to calculate the span of the stock’s price for all N days.
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day,
for which the price of the stock on the current day is less than its price on the given day.

Examples:

Create a stack of type int and push 0 in it
Set the answer of day 1 as 1 and run a for loop to traverse the days
While the stack is not empty and the price of st.top is less than or equal to the price of the current day, pop out the top value
Set the answer of the current day as i+1 if the stack is empty else equal to i – st.top
Push the current day into the stack
Print the answer using the answer array

https://www.youtube.com/watch?v=0BsPlzqksZQ

Time Complexity: O(N). It seems more than O(N) at first look. If we take a closer look,
we can observe that every element of the array is added and removed from the stack at most once.
Auxiliary Space: O(N) in the worst case when all elements are sorted in decreasing order.
 */
public class StockSpanProblem {
    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        int res[]=calculateSpan(price, n, S);
        Arrays.stream(res).forEach(e-> System.out.println(e+ " "));

    }

    private static int[] calculateSpan(int[] price, int n, int[] span) {
       Stack<Integer> st = new Stack<>();
       st.push(0);
       span[0]=1;
       for(int i=1;i< price.length;i++){
           // Pop elements from stack while stack is not
           // empty and top of stack is smaller than
           // price[i]
           while(!st.isEmpty() && price[st.peek()]<=price[i]){
               st.pop();
           }
           if(st.isEmpty()){ // If stack becomes empty, then price[i] is greater than all elements on left of it. i.e., price[0], price[1], ..price[i-1]
               span[i] =i+1;
           }
           else {
               span[i] = i - st.peek(); // if there elements still in the stack.price[i] is greater than elements after top of stack
           }
           st.push(i);
       }
       return span;
    }
}
