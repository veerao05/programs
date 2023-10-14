package com.arrays.easy;

public class GasStation {


    public static void main(String[] args) {

        String arr[] = new String[]{"4", "0:1", "2:2", "1:2", "3:1"};
        System.out.println(GasStation   (arr));
    }

    public static String GasStation(String[] strArr) {
        int gasStationCount = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            int startIndex = i - 1, count = 0; int inputGas = 0; //gallons
            while (count < strArr.length - 1) {
                String[] station1 = strArr[startIndex].split(":");
                inputGas += Integer.parseInt(station1[0]);
                int gasNeeded = Integer.parseInt(station1[1]);
                if (inputGas < gasNeeded)
                    break;
                else {
                    inputGas -= Integer.parseInt(station1[1]);
                    startIndex = startIndex + 1 == strArr.length - 1 ? 0 : startIndex + 1;
                    count++;
                }
            }
            if (count == strArr.length - 1)
                return Integer.toString(i);
        }
        return "impossible";
    }
    public static String funx(String[] strArr) {
        int gCount = Integer.parseInt(strArr[0]);
        //System.out.println(gCount);

        for (int i = 1; i < strArr.length; i++) {
            int startIndex = i;
            int count = 0;
            int inputGas = 0; //gallons
            while (count < (strArr.length - 1)) {
                String[] station1 = strArr[startIndex].split(":");
                inputGas += Integer.parseInt(station1[0]);
                int gasNeeded = Integer.parseInt(station1[1]);
                if (inputGas < gasNeeded) {
                    break;
                } else {
                    inputGas -= Integer.parseInt(station1[1]);
                    startIndex = startIndex + 1 == strArr.length ? 0 : startIndex + 1;
                    count++;
                }
            }
            System.out.println(count);
            System.out.println(strArr.length);
            System.out.println(i);
            if (count == strArr.length) {
                return String.valueOf(i + 1);
            }
        }

        return "impossible";
    }
}
