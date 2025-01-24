//Basic And Easy level problem of linked list from gfg
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
//delete alternate node in linked list
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        Node Temp=head;
        while(Temp!=null &&Temp.next!=null){
            
            Temp.next=Temp.next.next;
            Temp=Temp.next;
        }
    }
}
//The condition while (Temp != null && Temp.next != null) is crucial to avoid errors and ensure the program correctly processes the linked list. Let’s break it down step by step in simple terms:
// Why Temp != null?
// This checks if the current node (Temp) exists.
// If Temp == null, it means we have reached the end of the list, and there are no more nodes to process.
// Without this check, the loop would try to access Temp.next, causing a NullPointerException because Temp no longer points to a valid node.

// Why Temp.next != null?
// This checks if the next node exists.
// Remember, we are trying to skip nodes by updating Temp.next. For this operation (Temp.next = Temp.next.next) to work, there must be a valid node after the current one.
// If Temp.next == null, it means we are at the last node of the list, and there is no next node to skip. Continuing in such a case would lead to errors.

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        if(head==null) return -1;
        Node temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(k>length) return -1;
        int EleIndex=length-k;
       temp=head;
        for(int i=0;i<EleIndex;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}
//Alternative Approach
class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node first=head;
        Node second=head;
        if(head==null) return -1;
        for(int i=0;i<k;i++){
            if(first==null) return -1;
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second.data;
    }
}
//Delete node from particular position
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node Temp=head;
        
        if(x==1){
            
            return head.next;
        }
        for(int i=1;i<x-1;i++){
            Temp=Temp.next;
            
        }
        Temp.next=Temp.next.next;
        return head;
    }
}

//Delete node without head pointer
class Solution {
    void deleteNode(Node node) {
        // Your code here
        if(node.next==null){
            node=null;
        }
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
// Given a singly linked list, remove all nodes that have a node with a greater value anywhere to their right in the list. Return the head of the modified linked list.

// Examples:

// Input:
// LinkedList = 12->15->10->11->5->6->2->3
// Output: 15->11->6->3
class Solution {
    Node compute(Node head) {
        // your code here
        head=ReverseList(head);//reverse the currentList
        Node Temp=head;
        while(Temp!=null && Temp.next!=null){
            if(Temp.data>Temp.next.data){
                Temp.next=Temp.next.next;
            }
            else{
                Temp=Temp.next;
            }
        }
        return ReverseList(head);
    }
    
    Node ReverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;//Next Node Preservation
            currNode.next=prevNode;
            
            //update the nodes
            prevNode=currNode;//previous node becomes the current node
            currNode=nextNode;//current becomes nextNode
        }
        return prevNode;
    }
}
