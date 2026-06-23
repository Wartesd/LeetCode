class Solution {
    public boolean canJump(int[] nums) {
        boolean dp[] = new boolean[nums.length];
        dp[0] = true;
        for (int i=0; i<nums.length; i++){
            if (dp[i] == true){
                for (int j=i+1;j<=i+nums[i] && j<nums.length; j++){
                    dp[j] = true;
                }
            }
        }
        return dp[nums.length-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna