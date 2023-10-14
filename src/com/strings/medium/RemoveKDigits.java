package com.strings.medium;

import java.util.ArrayList;
import java.util.List;

public class RemoveKDigits {
    public static List<String> removeKdigits(String num, int k) {
        //int initialValue=Integer.parseInt(num);
        List<String> result = new ArrayList<>();
        String res;
        for (int i = 0; i < num.length(); i++) {

            if (i == 0) {
                System.out.println(num.substring(i+k));
            } else {
                res=num.substring(0, i)+num.substring(i+k);
                //System.out.println(num.substring(i+k));
                //System.out.println(num.substring(0, i));
                System.out.println(res);
            }
            //result.add(num.substring(i+k));

        }
        return result;
    }

    public static void main(String[] args) {
        List<String> res = removeKdigits("1432219", 3);
        res.forEach(System.out::println);
    }
}
