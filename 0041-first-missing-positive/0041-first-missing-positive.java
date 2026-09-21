class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i=0; i< nums.length; i++){
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                int target = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[target];
                nums[target] = temp;
            }
        }

        for (int i=0; i<nums.length; i++){
            if (nums[i] != i+1) return i+1;
        }

        return nums.length+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna