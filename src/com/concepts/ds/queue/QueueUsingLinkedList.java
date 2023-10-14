package com.concepts.ds.queue;

import java.util.Queue;
/*

Space Complexity : O(n)
Time complexity of enQueue() : O(1)
Time complexity of deQueue() : O(1)
Time complexity of isEmpty() : O(1)
Time complexity of isFull() : O(1)
 */
class CustomQueue{

    private int length;
    Node front,rear;
    CustomQueue(){
        length=0;
        front=rear=null;

    }
    public void enqueue(int data){
        Node node=new Node(data);
        if(isEmpty()){
            front=node;
        }
        else{
            rear.setNextNode(node);
        }
        rear=node;
        length++;

    }

    public int dequeue() throws  Exception{
        if(isEmpty()){
            throw  new Exception("queue empty");
        }
        int result = front.getData();
        front=front.getNextNode();
        length--;
        if(isEmpty()){
            rear=null;
        }
        return result;

    }
    public int first() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return front.getData();
    }

    public boolean isEmpty(){
        return (length==0);
    }

    public int size(){
        return length;
    }
}

class Node{
    int data;
    Node nextNode;

    Node(int data){
        this.data=data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
