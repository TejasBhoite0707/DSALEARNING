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
