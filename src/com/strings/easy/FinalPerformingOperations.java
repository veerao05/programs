package com.strings.easy;
/* FinalPerformingOperations
Time complexity  :o(n)
Space complexity : o(1)
 */
public class FinalPerformingOperations {
    public static int finalValueAfterOperations(String[] operations){
        int x = 0;
        for (String s : operations) {
            x += (s.charAt(1) == '+')? 1 : -1;
        }
        return x;
    }
    public static void main(String[] args) {
       String str="--X,X++,X++";
       System.out.println(finalValueAfterOperations(str.split(",")));
    }
}
