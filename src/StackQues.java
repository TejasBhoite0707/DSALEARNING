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
