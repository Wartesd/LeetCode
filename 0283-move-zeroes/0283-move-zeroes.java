class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0;
        int p2=0;
        while(p1<nums.length){
            if (nums[p1] != 0){
                int temp = nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
                p2++;
            }  
            p1++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna