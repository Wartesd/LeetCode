class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target);

        if (first == nums.length || nums[first] != target) return new int[] {-1,-1};

        int last = findBound(nums, target+1) -1 ;

        return new int[] {first, last};
    }
    private int findBound(int[] nums, int target){
        int left =0;
        int right = nums.length;

        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid;
            else left = mid + 1;
        }

        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna