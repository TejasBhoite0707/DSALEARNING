public class LinkedListImplementation {
    Node head;
    int size=0;
        class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

    public  void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
         temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        size++;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
        }
            head=head.next;
        size--;

    }

    public void deleteLast(){
            if(head==null){
                System.out.println("List is Empty");
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        size--;
    }
    public  void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    public int getSize(){
            return size+1;
    }


    public  static  void main(String[] args){
LinkedListImplementation list=new LinkedListImplementation();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        //list.printList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(50);
        list.addLast(25);
       // list.printList();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
       // list.printList();
        list.deleteLast();
        list.deleteLast();
        list.printList();
        System.out.println();
        list.addLast(13);
        list.addFirst(48);
        list.printList();
        System.out.println(list.getSize());
    }
}
