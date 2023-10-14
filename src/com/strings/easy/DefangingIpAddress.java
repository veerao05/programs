package com.strings.easy;

/* DefangingIPAddress
Time complexity  :
Space complexity :
 */
public class DefangingIpAddress {
    public static void main(String[] args) {
        String initialString="255.100.50.0";
        System.out.println(initialString.replace(".","[.]"));

        /*StringBuilder str = new StringBuilder();
        for (int i = 0; i < initialString.length(); i++) {
            if (initialString.charAt(i) == '.') {
                str.append("[.]");
            } else {
                str.append(initialString.charAt(i));
            }
        }
        System.out.println(str);*/
    }


}
