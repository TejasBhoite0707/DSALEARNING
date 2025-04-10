
//ArrayDeque OPERATIONS
public static void pb(ArrayDeque<Integer> dq, int x) {
    dq.offerLast(x);
}

public static void ppb(ArrayDeque<Integer> dq) {
    if(!dq.isEmpty()){
         dq.pollLast();
    }
}
 
public static int front_dq(ArrayDeque<Integer> dq) {
    return dq.isEmpty()?-1: dq.peekFirst();
}
    
public static void pf(ArrayDeque<Integer> dq, int x) {
     dq.offerFirst(x);
}

//Generate Binary Numbers
class solve {
    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> result=new ArrayList<>();
        Queue<String>q=new LinkedList<>();
        q.offer("1");
        
        for(int i=0;i<n;i++){
            result.add(q.poll());
            String n1=result.get(i)+"0";
            String n2=result.get(i)+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
}

//Number of 1 Bits
class Solution {
    static int setBits(int n) {
        // code here
        int count=0;
        while(n!=0){
            int bit=n&1;
            if(bit==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
