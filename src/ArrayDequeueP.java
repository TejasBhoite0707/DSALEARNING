import java.util.ArrayDeque;

public class ArrayDequeueP {

    public static  void main(String[] args){
        ArrayDeque A1=new ArrayDeque<>();
        A1.offer(55);
        A1.offerFirst(11);
        A1.offerLast(9);
        A1.offer(8);
        A1.offer(7);
        System.out.println(A1);
        System.out.println(A1.poll());
        System.out.println(A1);
        System.out.println(A1.pollLast());
        System.out.println(A1);
    }
}
