class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int counterZeroes = 0;
        int longestLength = 0;
        
        for (int right = 0; right < nums.length; right++){
            if (nums[right] == 0) counterZeroes++;
            while(counterZeroes > 1){
                if (nums[left] == 0) counterZeroes--;
                left++;
            }
            longestLength = Math.max(longestLength, right-left);
        }
        return longestLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna