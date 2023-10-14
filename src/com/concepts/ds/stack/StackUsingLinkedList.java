package com.concepts.ds.stack;

class Node {
    int data;
    Node link;
}
class StackList{
    Node top;
    StackList(){
        this.top=null;
    }

    public void push(int item){
          Node temp=new Node();
          if(temp == null){
              System.out.println("Heap full");
              return;
          }
          temp.data=item;
          temp.link=top;
          top=temp;

    }

    public void pop(){

       if(isEmpty()){
           System.out.println("Stack underflow");
           System.exit(-1);
       }
       else {
           top=top.link;

       }

    }

    public boolean isEmpty(){
        return (top==null);

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            System.exit(-1);
        }
        else {
            top=top.link;

        }
        return top.data;

    }

    public void display(){
        if(top == null){
            System.out.println("stack underflow");
            System.exit(1);
        }
        else{
            Node temp = top;
            while (temp!= null){
                System.out.print(temp.data );
                temp=temp.link;
                if(temp!=null){
                    System.out.print("->");
                }
            }
        }
    }

}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackList stackList=new StackList();
        stackList.push(10);
        stackList.push(20);
        stackList.push(30);
        System.out.println("After inserting elements");
        stackList.display();

        stackList.pop();

        System.out.println("After popping elements");
        stackList.display();
    }
}
