import java.util.*;
import java.util.Arrays;
public class ImplementationOfStackUsingArr{
Scanner sc=new Scanner(System.in);
static int top;
static int[]stack;
static int size;
ImplementationOfStackUsingArr(){
top=-1;
System.out.println("Enter the size of Stack");
size=sc.nextInt();
stack=new int[size];
}
public static boolean isEmpty(){
return top==-1;
}

public static void push(int data){
if(top==size-1){
System.out.println("Stack is Full");
}
else{
stack[++top]=data;
}
}

public static int pop(){
if(isEmpty()){
System.out.println("Stack is Empty");
}
else{
int popedEle=stack[top--];
return popedEle;
}
return -1;
}

public static int peek(){
return stack[top];
}

public void showStack(){
for(int i=0;i<=top;i++){
System.out.print(stack[i]+" ");
}
}
public static void main(String[]args){
ImplementationOfStackUsingArr obj=new ImplementationOfStackUsingArr();
obj.push(12);
obj.push(13);
obj.push(14);
obj.push(15);
obj.push(16);
obj.push(17);
obj.showStack();

System.out.println("Peek Element is "+obj.peek());

obj.pop();

obj.showStack();

System.out.println("Peek Element is "+obj.peek());

}

}