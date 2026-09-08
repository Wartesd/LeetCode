class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        
        for (int read =0; read < nums.length; read++){
            if (nums[read] != val){
                nums[write++] = nums[read];
            }
        }
        return write;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna