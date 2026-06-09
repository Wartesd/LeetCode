class Solution {
    public int climbStairs(int n) {
        int[] dp = new int [n];
        for (int i=0; i<n; i++){
            if (i < 2){
                dp[i] =i+1;
            }else{
               dp[i] = dp[i-1] + dp[i-2]; 
            }
        }
        return dp[n-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna