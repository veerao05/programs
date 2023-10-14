package com.misc;

import java.util.Stack;

public class KGMP {
    public static void main(String[] args) {
        String str = "[{()}]}"; // [}]{} // [()]{}{[()()]()} ALternative approach : using arrays
        char[] strArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<=strArr.length-1;i++) {
            if (stack.isEmpty()) {
                    stack.push(strArr[i]);//{
            }
            else
            if ((stack.peek() == '{' && strArr[i] == '}' )|| (stack.peek() == '[' && strArr[i] == ']') || (stack.peek() == '(' && strArr[i] == ')') ){ // { } { ]
                stack.pop();
            }else {
                stack.push(strArr[i]);
            }

        }

        if (!stack.empty()) {
            System.out.println("Not valid");
        } else {
            System.out.println("valid");
        }
    }
}
