class Solution {
    public int findMin(int[] nums) {
        int left =0;
        int right = nums.length -1; 
        int mid;
        int min = 2_147_483_647;
        while (left <= right){
            mid = left +(right-left)/2;
            min = Math.min(min, nums[mid]);
            if (nums[mid]>nums[right]){
                left = mid+1; 
            }else {
                right = mid-1;
            }
        }
        return min;      
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna