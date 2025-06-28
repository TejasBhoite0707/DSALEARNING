// Implement the function power(b, e), which calculates b raised to the power of e (i.e. be).
// Examples:
// Input: b = 3.00000, e = 5
// Output: 243.00000

class Solution {
    public double power(double b, int e) {
        double result = 1.0;
        long exp = e; 

        if (exp < 0) {
            exp = -exp;  
            b = 1.0 / b;  
        }

        while (exp > 0) {
            if (exp % 2 == 1) {  
                result *= b;
            }
            b *= b;
            exp /= 2; 
        }

        return result;
    }
}

// Summary of How This Happens:
// After backtracking, we are at the state curr = "A" and visit = [true, false, false].
// The for-loop runs from i = 0 to i = 2.
// The second iteration (i = 1) tries to pick "B", but we have already backtracked from it, so we skip this and move to the next iteration.
// The third iteration (i = 2) picks "C" because it is the next available character.
// This process ensures that we exhaust all possible combinations and explore every character order.

class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        HashSet<String> ans=new HashSet<>();
        boolean[] visit=new boolean[s.length()];
        makePermutations(s,ans,"",visit);
        return new ArrayList(ans);
    }
    
    static void makePermutations(String s,HashSet<String> ans,String curr,boolean[] visit){
        if(curr.length()==s.length()){
            ans.add(curr);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(!visit[i]){
                visit[i]=true;
                makePermutations(s,ans,curr+s.charAt(i),visit);
                visit[i]=false;
            }
        }
    }
}
