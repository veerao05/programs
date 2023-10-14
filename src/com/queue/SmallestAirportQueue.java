package com.queue;

public class SmallestAirportQueue {
    public static void main(String[] args) {
        SmallestQueue queue= new SmallestQueueImpl(3);
        queue.addPerson("A");
        queue.addPerson("B");
       // queue.addPerson("C");
       // queue.addPerson("D");

        int smallestCounter = queue.getSmallestCounter();
        System.out.println(smallestCounter);
    }
}
