package com.commonlyasked;

public class PrimeNosBetweenRange {
    public static void main(String[] args) {
      int first=10;
      int second= 20;
      for(int i=first;i<second;i++){
         boolean value= isPrime(i);
         if(value) System.out.println(i);

      }
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
