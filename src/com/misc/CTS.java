package com.misc;

import java.util.Arrays;


class Superclass{

    static{
        System.out.println(4);
    }
    {//instance block
        System.out.println(2);
    }
    Superclass(){
        System.out.println(5);
    }
}


public abstract class CTS extends Superclass {
    static{
        System.out.println(1);
    }
    {//instance block is always executed before finishing the constructor
        System.out.println(7);
    }
    public CTS(){
        System.out.println(3);
    }
    public static void main(String[] args) {
        //Deloitte cbl = new Deloitte(); // 4 1  5 3
        System.out.println("test");
        CTS cbl;

        String a="keep";
        String b="peek";
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        System.out.println(Arrays.equals(aArray,bArray));

    }





    /*public static void main(String[] args) {

        // 2 nos input
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println("Remainder is::"+c);
        }
        catch (Exception exp){
            System.out.println("Exception occurred::"+exp);
        }

    }*/
}
