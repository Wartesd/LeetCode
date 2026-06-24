class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum= nums[0];
        for (int i=0; i<nums.length; i++){
            if (sum < 0){
                sum=0;
            }
            sum+=nums[i];
            maxSum= Math.max(sum, maxSum);
        }
        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna