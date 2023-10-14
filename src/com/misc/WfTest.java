package com.misc;

public class WfTest {
    public static void main(String[] args) {
        // input “100” + “3000”
        // output "3100"
        String first = "09";
        String second = "1001";

        int count = Math.abs(second.length() - first.length());
        StringBuilder sb = new StringBuilder();

        if (first.length() > second.length()) {
            for (int i = 0; i < count; i++) {
                sb.append("0");
            }
            second = sb.toString() + second;

        } else {
            for (int i = 0; i < count; i++) {
                sb.append("0");
            }
            first = sb.toString() + first;
        }


        int carry = 0;
        StringBuilder finalResult = new StringBuilder();
        for (int i = first.length() - 1; i >= 0; i--) {
            int sum = Integer.parseInt(String.valueOf(first.charAt(i))) + Integer.parseInt(String.valueOf(second.charAt(i))) + carry;
            if (sum >= 10) {
                //main logic
                String val = String.valueOf(sum);
                finalResult.append(Integer.parseInt(String.valueOf(val.charAt(val.length() - 1))));
                carry = Integer.parseInt(String.valueOf(val.charAt(val.length() - 2)));


                // suggested logic
                //sb.append(Integer.parseInt(val) % 10 + "");
                //carry = '1';

            } else {
                finalResult.append(sum);
                carry = 0;
            }
        }


        System.out.println(finalResult.reverse());
    }

}
