class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(0, nums.length, nums, target);
    }
    private int binarySearch(int left, int right, int[] nums, int target){
        while (right > left){
            int medium = left + (right-left)/2;
            if (nums[medium] >= target) right = medium;
            else left = medium + 1;
        }
        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna