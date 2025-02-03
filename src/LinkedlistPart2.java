// Given the head of a singly linked list, your task is to left rotate the linked list k times.

// Examples:
// Input: head = 10 -> 20 -> 30 -> 40 -> 50, k = 4
// Output: 50 -> 10 -> 20 -> 30 -> 40
  
class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        Node Temp=head;
        int length=1;
        while(Temp.next!=null){
            length++;
            Temp=Temp.next;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        Temp.next=head;  //We make linked list circular
        Temp=head;
        for(int i=1;i<k;i++){
            Temp=Temp.next;//here at last we found secondlast node 
        }
        head=Temp.next;
        Temp.next=null;
        return head;
    }
}
