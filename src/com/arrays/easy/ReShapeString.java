package com.arrays.easy;

public class ReShapeString {

    public static void reshape(int number, String stringTOSplit) {

        String toWork = stringTOSplit;
        char[] characters = toWork.toCharArray();
        String finalString = "";
        for(int i = 0; i< characters.length; i++) {
            if(characters[i] == ' '){
                continue;
            }
            else {
                finalString +=characters[i];
            }
            if(finalString.length() == number) {
                System.out.println(finalString);
                finalString = "";
            }
            if(characters[i] == characters.length ){
                continue;
            }
        }
    }

    public static void main(String[] args) {
        reshape(3, "abc de fghij");
    }
}
