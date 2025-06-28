import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
   static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            next=null;
        }
    }
    static  class Queue{
        static Node head=null;
        static Node tail=null;
        static int []arr;
        static int size;
        static int rear=-1;
        static int front=-1;

        public static boolean isEmpty(){
            return head==null;
        }



        public static void add(int data){
            Node newNode=new Node(data);
            if(tail==null){
                tail=head=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }


    }
    public static void main(String[] args){
        Queue q=new Queue();

//        Queue<Integer>q=new LinkedList<>();
//        Queue<Integer>q=new ArrayDeque<>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);

        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
         q.remove();
        }

    }
}
