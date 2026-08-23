class Solution {
    public double myPow(double x, int n) {
        if (x == 0 && n > 0) return 0;
        if (n == 1) return x;
        if (n == -1) return 1/x;
        if (n == 0) return 1;
        double multiplyToX = 1;
        long N =n;
        
        if (N<0){
            x = 1/x;
            N = -N;
        }
        
        while (N != 1){
            if (N%2 !=0){
                multiplyToX *= x;
            } 

            N = N/2;
            x *=x;
        }
        return multiplyToX * x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna