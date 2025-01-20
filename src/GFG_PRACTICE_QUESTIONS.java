/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/



class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode=new Node(x);
       Node temp=head;
       if(head==null){ //if list is empty
           return newNode;
       }
       if(temp.next==null){ // if list has one elementg
           temp.next=newNode;
       }
        while(temp.next!=null){ //if list has more than one element
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        
        return head;
    }
}

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node slow=head;
        Node fast=head;
        Node newNode=new Node(x);
         if (head == null) {
            return newNode;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
        return head;
    }
}
