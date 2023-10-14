package com.patterns;

public class RightTriangle {
    public static void main(String[] args) {
        int i,j,rows=6;
        for( i=0;i<rows;i++){
            for( j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
