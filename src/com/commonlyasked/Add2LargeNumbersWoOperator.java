package com.commonlyasked;

public class Add2LargeNumbersWoOperator {
    public static void main(String[] args) {
        String first = "126";
        String second = "1985";
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        if (first.length() == second.length()) {
            for (int i = first.length() - 1; i >= 0; i--) {
                Integer sum = Integer.parseInt(String.valueOf(first.charAt(i))) + Integer.parseInt(String.valueOf(second.charAt(i))) + carry;
                if (sum > 10) {
                    String temp = sum.toString();
                    carry = Integer.parseInt(String.valueOf(temp.charAt(temp.length() - 2)));
                    System.out.println("carry::"+carry);
                    sb.append(Integer.parseInt(String.valueOf(temp.charAt(temp.length() - 1))));
                }
                else {
                    sb.append(sum);
                    carry =0;
                }
                System.out.println("sb::"+sb);

            }

        }
        /*else {
            int firstLength = first.length();
            int secondLength = second.length();
            int minLength = Math.min(firstLength,secondLength);
            "0"+first;



        }*/
        System.out.println(sb.reverse());


    }
}
