package com.commonlyasked;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Prime or not::"+isPrime(num));


    }
    static boolean isPrime(int number){
        if(number<=1) return false;
        for( int i=2;i<number;i++){
            //prime no always check till the primeno-previous value bcz
            //primeno%primeno will be 0 always
            if(number%i ==0) return false;
        }
        return true;
    }
}
