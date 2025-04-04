
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
