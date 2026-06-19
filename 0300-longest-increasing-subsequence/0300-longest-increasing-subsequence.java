class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i=1; i<dp.length; i++){
            for (int j=0; j<i; j++){
                if (nums[i] <= nums[j]) continue;
                dp[i] = Math.max(dp[j]+1, dp[i]);
            }
        }
        int max = 0;
        for (int val : dp) max = Math.max(max, val);
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna