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
