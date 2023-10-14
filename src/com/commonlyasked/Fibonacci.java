package com.commonlyasked;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=0,n3=1;
        System.out.println("Enter a number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Fibonacci series are");
        for(int i=0;i<num;i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.println(n1+" ");

        }
    }
}
