package com.misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*class Singleton1{

    private Singleton1(){

    }
    public static  Singleton1 getInstance(){
        return  singleHolder.instance;
    }
    static class singleHolder{
        private static Singleton1 instance = new Singleton1();

    }
//bill halfmen algorithm -lazy + multi threading

}*/
//countdown large it barriers - wait and signaging -cycle barrier
// stratergy chain of responsibilty template
//JVisual Jstart threaddump Runtime
//patch(particular field) , put?
//Angular jquery
//AWS
//dca->smax
public class Opentext {

    public static void main(String[] args) {

        //System.out.println(Singleton1.getInstance());
        //System.out.println(Singleton1.getInstance());
        String input="ramesh ramesh ramesh";
        //chars collections on stream
        Map<Character,Long> map =input.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }
}
