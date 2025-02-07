//first approach using recursion 
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            int top=st.pop();
            insertAtBottom(st,x);
            st.push(top);
        }
        return st;
    }
}

//second approch using new stack
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        Stack<Integer>Temp=new Stack<>();
        
        while(!st.isEmpty()){
            Temp.push(st.pop());
        }
        st.push(x);
        while(!Temp.isEmpty()){
            st.push(Temp.pop());
        }
        return st;
    }
}

//Reverse String using Stack
class Solution {
    
    public String reverse(String S){
        //code here
        String Answer="";
        Stack<Character>newStack=new Stack<>();
        for(int i=0;i<S.length();i++){
            newStack.push(S.charAt(i));
        }
       while(!newStack.isEmpty()){
           char ch=newStack.pop();
           Answer+=ch;
       }
       return Answer;
    }

}

//You are given a stack St. You have to reverse the stack using recursion.
class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        else{
            int topele=s.pop();
            reverse(s);
            insertAtBottom(topele,s);
        } 
    }  
    static void insertAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
        }
        else{
            int top=s.pop();
            insertAtBottom(data,s);
            s.push(top);
        }
    }   
}

// Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']', verify the validity of the arrangement.
// An input string is valid if:

//          1. Open brackets must be closed by the same type of brackets.
//          2. Open brackets must be closed in the correct order.

// Examples :
// Input: s = "[{()}]"
// Output: true
// Explanation: All the brackets are well-formed.

class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }
            else if(stack.isEmpty()){  //essential to this input s=")("
                return false;
            }
            else{
                if(ch=='}'){
                    if(stack.pop()!='{') return false;
                }
                if(ch==']'){
                    if(stack.pop()!='[') return false;
                }
                if(ch==')'){
                    if(stack.pop()!='(') return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

//Implement stack using array
class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        arr[++top]=x;
    }

    public int pop() {
        // Your Code
        if(top==-1) return -1;
        return arr[top--];
    }
}

//stack using linkedlist
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;
    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode newNode=new StackNode(a);
        newNode.next=top;
        top=newNode;
    }
    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if (top == null) return -1;
        int topele=top.data;
        top=top.next;
        return topele;
    }
}

//get minimum element from the stack
	public int min(Stack<Integer> s)
        {
           //add code here.
           int Min=Integer.MAX_VALUE;
           Stack<Integer> temp=new Stack<>();
           while(!s.isEmpty()){
              int top= s.pop();
              Min=Math.min(Min,top);
              temp.push(top);
           }
           while(!temp.isEmpty()){
               s.push(temp.pop());
           }
           return Min;
	}


// Input: A[] = [1 2 3 4 5]
// Output: 1 1 1 1 1
// Explanation: 
// After pushing elements to the stack, 
// the stack will be "top -> 5, 4, 3, 2, 1". 
// Now, start popping elements from the stack
// popping 5: min in the stack is 1.popped 5
// popping 4: min in the stack is 1. popped 4
// popping 3: min in the stack is 1. popped 3
// popping 2: min in the stack is 1. popped 2
// popping 1: min in the stack is 1. popped 1
class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer>Permanant=new Stack<>();
        Permanant.push(arr[0]);
        for(int i=1;i<n;i++){
            if(Permanant.peek()<=arr[i]){
                Permanant.push(Permanant.peek());
            }
            else{
               Permanant.push(arr[i]); 
            }
            
        }
        return Permanant;
    }    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
    while(!s.isEmpty())
       {
           System.out.print(s.pop()+" ");
       }
        
    }
}

//Make the array beautiful
// Given an array of negative and non-negative integers. You have to make the array beautiful. An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or non-negative. And you can do the following operation any number of times until the array becomes beautiful.
// If two adjacent integers are different i.e. one of them is negative and other is non-negative, remove them.
// Return the beautiful array after performing the above operation.
// Note:An empty array is also a beautiful array. There can be many adjacent integers which are different as stated above. So remove different adjacent integers as described above from left to right
	
class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer>stack=new Stack<>();
        for(int ele:arr){
            if(stack.size()!=0){
                if((stack.peek()<0 && ele<0) || (stack.peek()>=0 && ele>=0)){
                    stack.push(ele);
                }
                else{
                    stack.pop();
                }
            }
            else{
                stack.push(ele);
            }
        }
        return new ArrayList<>(stack);
    }
}
