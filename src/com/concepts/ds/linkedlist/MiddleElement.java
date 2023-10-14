package com.concepts.ds.linkedlist;



class LinkedList{
    private Node head;
    private Node tail;

    LinkedList(){
        this.head = new Node("head");
        tail=head;

    }
    public Node head(){
        return head;
    }
    public void add(Node node){
        tail.next=node;
        tail=node;
    }


    static class Node{
        private Node next;
        private String data;

        Node(String data){
            this.data=data;
        }
        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
public class MiddleElement {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add( new LinkedList.Node("1"));
        linkedList.add( new LinkedList.Node("2"));
        linkedList.add( new LinkedList.Node("3"));
        linkedList.add( new LinkedList.Node("4"));

        LinkedList.Node  current= head;
        LinkedList.Node  middle= head;
        int length =0 ;

        while(current.next() != null){
            length++;
            if(length%2==0){
                middle= middle.next();
            }
            current = current.next();
        }
        if(length%2 ==1){
            middle= middle.next();
        }
        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);

    }
}
