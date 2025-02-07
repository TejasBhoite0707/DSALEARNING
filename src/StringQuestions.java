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
