class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        // code here
        if (n <= 0) {
            return false;
        }
         // If n is a power of two, it will have only one bit set in binary representation
        // The expression n & (n - 1) will be 0 only when n is a power of two
        return (n & (n - 1)) == 0;
    }
}
