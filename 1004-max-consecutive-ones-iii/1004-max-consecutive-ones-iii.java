class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int localZeroesCounter = 0; 
        int maxOnesStringLength =0;
        for (int right=0; right < nums.length; right++){
            if (nums[right] == 0 ){
                localZeroesCounter++;
            }
            if (localZeroesCounter > k){
                while (localZeroesCounter > k){
                    if (nums[left] == 0) localZeroesCounter--;
                    left++;
                }
            }
            maxOnesStringLength = Math.max(maxOnesStringLength, right-left+1);
        }
        return maxOnesStringLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna