package com.concepts.producerconsumer;


import java.util.LinkedList;
import java.util.Queue;

class CustomQueue<E>{
    int limit;
    Queue<E> queue;
    public CustomQueue(int limit){
        queue=new LinkedList<>();
        this.limit=limit;
    }
    public synchronized void enqueue(E e) throws InterruptedException{

        if(queue.size() == limit){
            System.out.println("Queue is full!!"+Thread.currentThread().getName()+"is waiting");
            wait();
        }
        System.out.println("Queue is not full!!"+Thread.currentThread().getName()+"is producing");
        queue.add(e);
        notifyAll();


    }
    public  synchronized  E dequeue() throws InterruptedException{
        if(queue.size() == 0){
            System.out.println("Queue is empty!!"+Thread.currentThread().getName()+"is waiting");
            wait();
        }
        System.out.println("Queue is not full!!"+Thread.currentThread().getName()+"is producing");
        E e = queue.remove();
        notifyAll();
        return e;

    }

}
class Producer implements  Runnable{

    CustomQueue<Integer> sharedQueue;
    Producer(CustomQueue<Integer> sharedQueue){
        this.sharedQueue=sharedQueue;
    }
    @Override
    public void run(){
        while(true){
            produceItems();
        }
    }

    private void produceItems() {
        try{
        for(int i=0;i<=10;i++){
            System.out.println("Produced : " + i);
            sharedQueue.enqueue(i);
        }
        }
        catch (InterruptedException exp){
            System.out.println("Unable to add element ::"+exp.getMessage());
        }
    }
}

class Consumer implements  Runnable{
    CustomQueue<Integer> sharedQueue;
    Consumer(CustomQueue<Integer> sharedQueue){
        this.sharedQueue=sharedQueue;
    }
    @Override
    public void run(){
        while(true){
           int item= consumeItems();
        }
    }

    private int consumeItems() {
        int item = 0;
        try{
        item= sharedQueue.dequeue();
        System.out.println("CONSUMED : "+item);}
        catch(InterruptedException exp){
            System.out.println("Unable to remove element ::"+exp.getMessage());
        }
        return item;
    }

}

public class ProducerConsumer {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>(10);
        Producer producer1=new  Producer(queue);
        Producer producer2=new  Producer(queue);

        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);


        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);

        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

        producerThread1.setName("producer1");
        producerThread2.setName("producer2");

        consumerThread1.setName("consumer1");
        consumerThread2.setName("consumer2");

        producerThread1.start();
        producerThread2.start();

        consumerThread1.start();
        consumerThread2.start();

    }
}
