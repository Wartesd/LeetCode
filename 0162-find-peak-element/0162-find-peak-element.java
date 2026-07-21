class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left < right){
            mid = left+(right-left)/2;
            if (nums[mid+1]>nums[mid]) left = mid+1;
            else right = mid;
        }
        return left;
    }
}  

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna