//Next Greater Element
// Given an array arr[ ] of integers, the task is to find the next greater element for each element of the array in order of their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
// If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.
// Input: arr[] = [6, 8, 0, 1, 3]
// Output: [8, -1, 1, 3, -1]
// Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.
  class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer>stack=new Stack<>();
        ArrayList<Integer>FinalAnswer=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            FinalAnswer.add(-1);
        }
        
        for(int j=arr.length-1;j>=0;j--){
            while(!stack.isEmpty() && stack.peek()<=arr[j]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                FinalAnswer.set(j,stack.peek());
            }
            stack.push(arr[j]);
        }
        return FinalAnswer;
    }
}
//Two Stacks in an Arra
// Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.
// twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
// push1 : pushes element into the first stack.
// push2 : pushes element into the second stack.
// pop1 : pops an element from the first stack and returns the popped element. If the first stack is empty, it should return -1.
// pop2 : pops an element from the second stack and returns the popped element. If the second stack is empty, it should return -1.
// Examples:
// Input:
// push1(2)
// push1(3)
// push2(4)
// pop1()
// pop2()
// pop2()
// Output: [3, 4, -1]
// Explanation:
// push1(2) the stack1 will be {2}
// push1(3) the stack1 will be {2,3}
// push2(4) the stack2 will be {4}
// pop1()   the poped element will be 3 from stack1 and stack1 will be {2}
// pop2()   the poped element will be 4 from stack2 and now stack2 is empty
// pop2()   the stack2 is now empty hence returned -1.
class twoStacks {
     int []arr=new int[100];
        int start=-1;
        int end=100;
    twoStacks() {    
    }
    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(start+1==end) return;
        start++;
        arr[start]=x;
    }
    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        if(start==end-1) return;
        end--;
        arr[end]=x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(start==-1) return -1;
        return arr[start--];
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(end==100) return -1;
        return arr[end++];
    }
}

// Given a stack, the task is to sort it such that the top of the stack has the greatest element.
// Example 1:
// Input:
// Stack: 3 2 1
// Output: 3 2 1
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        int [] arr=new int[s.size()];
        int i=0;
        while(!s.isEmpty()){
            arr[i]=s.pop();
            i++;
        }
        Arrays.sort(arr);
        Stack<Integer>ans=new Stack<>();
        for(int j=0;j<arr.length;j++){
            ans.push(arr[j]);
        }
        
        return ans;
    }
}
//alternative way using recursion
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            sort(s);
            sortedInsert(s, temp);
        }
        return s;
    }

    private void sortedInsert(Stack<Integer> s, int element) {
        if (s.isEmpty() || s.peek() <= element) {
            s.push(element);
        } else {
            int temp = s.pop();
            sortedInsert(s, element);
            s.push(temp);
        }
    }
}

//Remove the balls
// Input:
// N = 3
// color[] = {2, 2, 5}
// radius[] = {3, 3, 4}
// Output: 
// 1
// Explanation: 
// First ball and second ball have same color 2 and 
// same radius 3.So,after removing only one ball 
// is left.It could not be removed from the array. 
// Hence, the final array has length 1
class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<N;i++){
            if(!stack.isEmpty() && color[stack.peek()]==color[i] && radius[stack.peek()]==radius[i])
            {
                stack.pop();
            }
            else{
                stack.push(i);
            }
        }
        return stack.size();
    }
}
