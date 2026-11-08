class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum=0;
        int rightSum=0;

        for (int num : nums) rightSum += num;

        for (int i=0; i < nums.length; i++){
            int temp = nums[i];
            rightSum -= temp;
            nums[i] = Math.abs(rightSum - leftSum);
            leftSum += temp;
        }

        return nums; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna