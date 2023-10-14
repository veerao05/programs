package com.strings.easy;

public class GoalInterpretation {
    public static String interpret(String command) {
        StringBuilder sb=new StringBuilder();
           for(int i=0;i<command.length();i++){
               if(command.charAt(i)!='(' && command.charAt(i)!=(')')){
                   sb.append(command.charAt(i));
               }
               else if(command.charAt(i)==')' && command.charAt(i-1)==('(')){
                    sb.append("o");
               }
           }
           return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
