package com.strings.easy;

import java.util.HashMap;
import java.util.Stack;

/*
Time complexity
Space complexity
 */
public class ValidParenthesis {
    public static boolean  isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character, Character> complement =
                new HashMap<>();

        complement.put(')', '(');
        complement.put(']', '[');
        complement.put('}', '{');
        for(Character ch: s.toCharArray()){
            switch (ch){
                case  '(':
                case  '{':
                case  '[':stack.push(ch);
                break;
                case ')':/*if(stack.isEmpty() || stack.pop()!='('){
                    return false;
                }break;*/
                case '}':/*if(stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }break;*/
                case ']':/*if(stack.isEmpty() || stack.pop()!='['){
                    return false;

                }break;*/
                    if (stack.isEmpty() || stack.pop() != complement.get(ch)) {
                        return false;
                    }break;

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("({[)}]"));
    }
}
