import java.util.*;
public class PushAtBottom {

    public static void pushAtBottomOfStack(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
        }
        else {
            int top=s.pop();
            pushAtBottomOfStack(data,s);
            s.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
pushAtBottomOfStack(5,s);
while (!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
}
    }
}
