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

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        Node t1=head1;
        Node t2=head2;
        while(t1!=null && t2!=null){
            if(t1.data!=t2.data) return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
}

class Solution {
    public int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.
        int length=0,ans=-1;
        Node Temp=head;
        while(Temp!=null){
             length++;
            if(length%k==0){
                ans=Temp.data;
            }
            Temp=Temp.next;
           
        }
        return ans;
    }
}

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node fast=head;
        Node slow=head;
        int length=0;
       Node Temp=head;
        while(Temp!=null){
            length++;
            Temp=Temp.next;
        }
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return (length%2==1) ? slow.data:slow.next.data;
    }
}
