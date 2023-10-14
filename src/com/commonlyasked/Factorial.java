package com.commonlyasked;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorial=1;
        System.out.println("Enter a number");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Factorial cant be calculated for negative number");
        }
        else if(num==0){
            System.out.println("Factorial of 0 is "+ factorial);
        }
        else{
            for(int i=1;i<=num;i++){
                factorial=factorial*i;
                System.out.println("Factorial is "+ factorial);
            }
        }

    }
}
