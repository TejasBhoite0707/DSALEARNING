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
