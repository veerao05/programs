package com.concepts.ds.stack;

class Stack{
  private int top;
  private int capacity;
  private int arr[];

  Stack(int size){
      top=-1;
      arr=new int[size];
      capacity=size;
  }
  public void push(int item){
     if(isFull()){
         System.out.println("Stack is Full");
         System.exit(-1);
     }
     System.out.println("Inserted Element::"+item);
     arr[++top]=item;

  }

  public int pop(){
      if(isEmpty()){
          System.out.println("Stack is empty");
          System.exit(-1);
      }
      int item = arr[--top];
      return item;

  }

  public boolean isEmpty(){
      return (top==-1);

  }

  public int getSize(){
      return top+1;

  }
  public boolean isFull(){
     return top == capacity -1;
  }

  public void displayStack(){
   for(int i=0;i<=top;i++){
       System.out.println(arr[i]+" ");
   }
  }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After pushing::");
        stack.displayStack();

        stack.pop();
        System.out.println("After popping::");
        stack.displayStack();

    }
}
