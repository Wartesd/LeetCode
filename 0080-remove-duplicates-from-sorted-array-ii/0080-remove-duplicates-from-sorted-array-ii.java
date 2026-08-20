class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
           
        int length = 2;
        for (int i=2; i < nums.length; i++){
            if (nums[i] != nums[length-2]){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna