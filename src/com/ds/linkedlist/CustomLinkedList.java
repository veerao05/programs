package com.ds.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* Points to remember : next means next node*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

class LinkedList {
    Node head;

    /*
    steps:
    Traverse linked list using two-pointers.
    Move one pointer by one and the other pointers by two.
    When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list.

    Time Complexity: O(N), As we are traversing the list only once.
    Auxiliary Space: O(1), As constant extra space is used.
     */
    void printMiddleElement() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println("The middle element is::" + slowPointer.data);


    }

    /* To find the length of list
    * Time complexity : o(n)
    * Space complexity: */
    int lengthOfLinkedList() {

        if (head == null) {
            System.out.println("No data to display");
            return 0;
        }
        Node temp = head;
        int k = 0;
        while (temp != null) {
            temp = temp.next;
            k++;
        }
        return k;

    }

    /* To find the length of list
     * Time complexity : o(n)
     * Space complexity: */
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void pushAtFront(int item) {
        Node newNode = new Node(item);
        newNode.next = head;//Make next of new Node as head
        head = newNode;//Move the head to point to new Node
    }
    void pushAtRear(int item){
        Node newNode =new Node(item);
        if(head==null){

            head=newNode;
        }
        else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void deleteAtFront(int item){
        if(head==null){
            System.out.println("nothing to delete");
        }
        else if(head.next==null){
            System.out.println("Deleted element is::"+head.data);
            head=null;
        }
        else {
            System.out.println("Deleted element is::"+head.data);
            head=head.next;
        }
    }

    void deleteAtRear(int item){
        Node temp = head;
        if(head==null){
            System.out.println("nothing to delete");
        }
        else if(head.next==null){
            System.out.println("Deleted element is::"+head.data);
            head=null;
        }
        else {
            temp=head;
            while ((temp.next.next!=null))
            temp=temp.next;
        }
        temp.next=null;
    }

    /*
    using Floyd's Algorithm
    steps:
    Traverse linked list using two pointers.
    Move one pointer(slow_p) by one and another pointer(fast_p) by two.
    If these pointers meet at the same node then there is a loop. If pointers do not meet then the linked list doesn’t have a loop.
    Time Complexity: O(n)
    Space Complexity: O(1)
    */
    void detectLoop() {
        Node slowPointer = head;
        Node fastPointer = head;
        boolean flag = false;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                flag = true;
                break;
            }

        }
        if (flag) {
            System.out.println("Loop found at Node" + slowPointer.data);
        } else {
            System.out.println("No Loop found!!");
        }

    }

    /*
    steps:
    This method is also dependent on Floyd’s Cycle detection algorithm.
    Detect Loop using Floyd’s Cycle detection algorithm and get the pointer to a loop node.
    Count the number of nodes in the loop. Let the count be k.
    Fix one pointer to the head and another to a kth node from the head.
    Move both pointers at the same pace, they will meet at the loop starting node.
    Get a pointer to the last node of the loop and make the next of it NULL.

    Time complexity: O(N), Only one traversal of the loop is needed.
    Auxiliary Space: O(1).
     */
    void detectAndRemoveLoop() {

        Node slowPointer = head;
        Node fastPointer = head;
        boolean flag = false;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                flag = true;
                break;
            }

        }
        if (flag) {
            System.out.println("Loop found at Node" + slowPointer.data);
            removeLoop(slowPointer);
        } else {
            System.out.println("No Loop found!!");
        }

    }

    void removeLoop(Node slowPointer) {

        Node ptr1 = slowPointer;
        Node ptr2 = head;

        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = null;

    }

    /* Rotate the list by k times clockwise
    * Approach : Brute Force
    * We have to move the last element to first for each k.
      For each k, find the last element from the list. Move it to the first
    * Time Complexity: O(Number of nodes present in the list*k)
      Reason: For k times, we are iterating through the entire list to get the last element and move it to first
    * Space Complexity: O(1)
      Reason: No extra data structures are used for computations.*/
    void rotateList(int k) {

        if (head == null || head.next == null) {
            return;
        }
        for (int i = 0; i < k; i++) {
            Node temp = head;
            while (temp.next.next != null) temp = temp.next;
            //Make temp Node as ur end node
            Node end = temp.next;
            //Assign temp.next(40) as Null for end node assuming k=1
            temp.next = null;
            //end next (50) will be pointing to head note assuming k=1
            end.next = head;
            //end note will become head note
            head = end;

        }
    }

    /* Reverse a linked list
     * Time complexityb: O(n)
     * Space complexity :O(1)*/
    void reverseLinkedList() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next; // we are keeping temp pointer so as to remember this node when link is broken
            curr.next = prev; // current.next will point to null first time . link gets broken b/w temp and curr.(right to left assignment when
            // .next comes in left side
            prev = curr;// current node will become previous node
            curr = temp;// temp node will become curr node
        }
        head = prev;


    }

    /*
    Steps:.
    Iterate through the given list to store it in an array.
    Iterate through the array.
    For each index in range of n/2 where n is the size of the array
    Check if the number in it is the same as the number in the n-index-1 of the arra
    Time Complexity: O(N)

    Reason: Iterating through the list to store elements in the array.
    Space Complexity: O(N)
    Reason: Using an array to store list elements for further computations.
     */
    boolean isPalindrome() {
        Node cur = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur.data);
            cur = cur.next;
        }
        for (int i = 0; i < arr.size() / 2; i++)
            if (arr.get(i) != arr.get(arr.size() - i - 1)) return false;
        return true;
    }

    /*Remove Duplicates from unsorted(duplicates may or maynot be contiguous) and sorted(duplicates are contiguous) list
    * Time Complexity: O(N), on average (assuming that hash table access time is O(1) on average).
    Auxiliary Space: O(N), As extra space is used to store the elements in the stack
    * Unsorted:
    * Input: linked_list = 12 -> 11 -> 12 -> 21 -> 41 -> 43 -> 21
    Output: 12 -> 11 -> 21 -> 41 -> 43
    * Sorted:
    *  Before removing duplicates linked list is:
       1 2 2 2 3 3 3
       after removing duplicates linked list is:
       1 2 3 */
    void duplicatesInList(){
        Node cur=head;
        Node prev=null;
        Set<Integer> set= new HashSet<>();
        while(cur!=null){
            if(set.contains(cur.data)){
                prev.next=cur.next;//make prev.next node to point to cur.next node.thereby removing the link of duplicate node.
            }
            else {
                set.add(cur.data);
                prev=cur;
            }
            cur=cur.next;
        }
    }


    //Sort a linked list
    /*Traverse the list and count the number of 0s, 1s, and 2s. Let the counts be n1, n2, and n3 respectively.
    Traverse the list again, fill the first n1 nodes with 0, then n2 nodes with 1, and finally n3 nodes with 2.
    Time Complexity: O(n) where n is the number of nodes in the linked list.
    Auxiliary Space: O(1)*/
    public Node sortLinkedList() {

        // initialise count of 0 1 and 2 as 0
        int[] countArr = {0, 0, 0};
        Node temp = head;

        /* count total number of '0', '1' and '2'
         * count[0] will store total number of '0's
         * count[1] will store total number of '1's
         * count[2] will store total number of '2's  */
        while(temp != null) {
            countArr[temp.data]++;
            temp = temp.next;
        }

        temp = head;
        int i = 0;

        //Create a linked list in sorted order
        /* Let say count[0] = n1, count[1] = n2 and count[2] = n3
         * now start traversing list from head node,
         * 1) fill the list with 0, till n1 > 0
         * 2) fill the list with 1, till n2 > 0
         * 3) fill the list with 2, till n3 > 0  */
        while(temp != null) {

            if(countArr[i] == 0) {
                i++;
            } else {
                temp.data = i;
                countArr[i]--;
                temp = temp.next;
            }
        }
        return temp;

    }
}

public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //int arr[] = new int[]{10,10, 20, 30,30,20,30,20};
        int arr[] = new int[]{0,1, 0, 2,1,1,2,1,2};
        for (int i = arr.length - 1; i >= 0; i--) {
            list.pushAtFront(arr[i]);
        }
        list.display();

        /* Finding middle element*/
        list.printMiddleElement();

        //sort 0's,1's and 2's
        list.sortLinkedList();
        list.display();

        /*creating a loop*/
        list.head.next.next.next.next.next = list.head.next.next;
        list.detectLoop();

        /*detect and remove the loop*/
        list.detectAndRemoveLoop();
        list.display();

        /*Duplicates in list */
        list.duplicatesInList();
        System.out.println("After duplicates removal in unsorted array");
        list.display();


        /* Reverse linked list */
        list.reverseLinkedList();
        System.out.println("After reversing the list");
        list.display();


        /* palindrome compare */
        boolean res = list.isPalindrome();
        System.out.println("Palindrome is" + res);


        System.out.println("Length of list" + list.lengthOfLinkedList());

        /*Rotate the list*/
        list.rotateList(2);
        list.display();




    }

}
