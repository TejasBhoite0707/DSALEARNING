//Easy String
class Solution 
{ 
    String transform(String S) 
    {
        // code here
        String PrevAns=S.toLowerCase();
        String ans="";
        int count=1;
        for(int i=1;i<S.length();i++){
            if(PrevAns.charAt(i-1)==PrevAns.charAt(i)){
                count++;
            }
            else{
                ans+=count+""+PrevAns.charAt(i-1);
                count=1;
            }
        }
        return ans+=count+""+PrevAns.charAt(PrevAns.length()-1);
    }
}

// Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
// It is guaranteed that the given equation is valid, and there are no leading zeros.
// Example 1:
// Input:
// S = "20-3+5*2"
// Output: 2*5+3-20
// Explanation: The equation is reversed with
// numbers remaining the same.

class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        String NewString="";
        Stack<String>st=new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(Character.isDigit(ch)){
                NewString+=ch;
            }
            else{
                st.push(NewString);
                NewString="";
                NewString+=ch;
                st.push(NewString);
                NewString="";
            }
            
        }
        st.push(NewString);
        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        
        return ans;
    }
}

// Print Bracket Number
// Given a string str, the task is to find the bracket numbers, i.e., for each bracket in str, return i if the bracket is the ith opening or closing bracket to appear in the string. 
//  Examples:
// Input:  str = "(aa(bdc))p(dee)"
// Output: 1 2 2 1 3 3
// Explanation: The highlighted brackets in
// the given string (aa(bdc))p(dee) are
// assigned the numbers as: 1 2 2 1 3 3.

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        int count=0;
        ArrayList<Integer>FinalAns=new ArrayList<>();
        Stack<Integer>bracketStack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('){
                count++;
                bracketStack.push(count);
                FinalAns.add(count);
            }
            else if(ch==')'){
                FinalAns.add(bracketStack.pop());
            }
        }
        return FinalAns;
    }
};
//String Manipulation
// Tom is a string freak. He has got sequences of words arr[] to manipulate. If in a sequence, two same words come together then Tom destroys each other. Find the number of words left in the sequence after this pairwise destruction. 
// Examples:
// Input: arr[] = ["ab", "aa", "aa", "bcd", "ab"]
// Output: 3
// Explanation: After the first iteration, we'll have: ab bcd ab. We can't further destroy more strings and hence we stop and the result is 3. 
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        // Your code goes here
        Stack<String>stackans=new Stack<>();
        for(String ele:arr){
            if(stackans.isEmpty()){
                stackans.push(ele);
            }
            else if(ele.equals(stackans.peek()))
            {
                stackans.pop();
            }
            else{
                stackans.push(ele);
            }
        }
        return stackans.size();
    }
}

// Given an array arr[] and a number k. The task is to delete k elements that are smaller than the next element (i.e., we delete arr[i] if arr[i] < arr[i+1]) or become smaller than the next because the next element is deleted.
// Examples:
// Input: arr[] = [20, 10, 25, 30, 40], k = 2
// Output: [25, 30, 40]
// Explanation: First we delete 10 because it follows arr[i] < arr[i+1]. Then we delete 20 because 25 is moved next to it and it also starts following the condition.
class Solution {
    // Function for finding maximum and value pair
    public static ArrayList<Integer> deleteElement(int arr[], int k) {
        // Complete the function
        Stack<Integer>ArrEleStack=new Stack<>();
        for(int arrEle:arr){
            if(ArrEleStack.isEmpty() && k==0){
                ArrEleStack.push(arrEle);
            }
            else{
                while(!ArrEleStack.isEmpty() && k>0 && ArrEleStack.peek()<arrEle){
                    ArrEleStack.pop();
                    k--;
                }
                ArrEleStack.push(arrEle);
            }
        }
        return new ArrayList<>(ArrEleStack);
    }
}
