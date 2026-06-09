class Solution {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 2;
        int result = 0;
        for (int i=1; i<=n; i++){
            if (i<3) result = i;
            else{
                result = prev1+prev2;
                prev1 = prev2;
                prev2 = result;
            }
        }
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna