package com.strings.medium;

public class StringCompression {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            sb.append(chars[i]);
            int count =1;
            while(i<chars.length-1){
                if(chars[i]==chars[i+1]){
                    count++;
                    i++;
                }
                else {
                    break;
                }
            }
            if(count>1){
                sb.append(count);
            }
        }
        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        System.out.println(chars);
        return sb.length();
    }
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','b','b','b','b','b','b','b','c','c'}));
    }
}
