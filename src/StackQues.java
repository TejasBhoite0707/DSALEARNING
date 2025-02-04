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
