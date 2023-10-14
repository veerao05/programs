package com.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Time Complexity: O(N)
Auxiliary Space: O(1)*/
class OddEven {

    int count = 1;
    int MAX = 20;

    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("odd no is:: " + count + " ");
                count++;

                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (count < MAX) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Even no is:: " + count + " ");
                count++;

                notify();
            }
        }
    }
}

class singleton{

    private static singleton instance ;
    private  singleton(){

    }

    public static singleton getInstance(){

        if (instance == null){
            synchronized(singleton.class){
                if(instance == null){
            instance = new singleton();
        }}}
        return instance;

    }

}

public class Ey {



    public static void main(String[] args) {
        //duplicate word
        String str="Alive is Awesome Be in present Manchester United is also known as RedDevil alive";
        List<String> list=Arrays.asList(str.toLowerCase().split(" "));
        System.out.println(list);
       // String[] stringSplit=str.split(" ");
        System.out.println(Arrays.stream(str.split(" ")).map(String::toLowerCase)
                .filter(s->Collections.frequency(list,s)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        OddEven oddEven=new OddEven();
        Thread t1=new Thread(oddEven::printEven);
        Thread t2=new Thread(oddEven::printOdd);

        t1.start();
        t2.start();

        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        //Find Minimum Value in Array  { 9, 2, 3, 6}
        int[] arr = new int[]{ 9, 2, 3, 6};
        int minValue=arr[0];
        for(int i : arr){//o(n)
            if(i<minValue)minValue=i;
        }
        System.out.println(minValue);


    }
}

