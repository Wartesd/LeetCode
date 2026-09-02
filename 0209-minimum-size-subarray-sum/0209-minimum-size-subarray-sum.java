class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int sum = 0;
        int minSubarray = Integer.MAX_VALUE;

        for (int end =0; end < nums.length; end++){
            sum += nums[end];
            while(sum >= target){
                minSubarray =  Math.min(end-start + 1, minSubarray);
                sum -= nums[start];
                start++;
            }
        }
        return minSubarray == Integer.MAX_VALUE ? 0 : minSubarray;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna