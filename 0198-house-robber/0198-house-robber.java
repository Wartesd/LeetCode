class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        int result = 0;
        for (int i=0; i<nums.length; i++){
            if (i == 0){
                result = nums[0];
                prev1 = result;
            }
            else if (i==1){
                result = Math.max(prev1,nums[1]);
                prev2 = result;
            } 
            else{
                result = Math.max(prev1+nums[i],prev2);
                prev1=prev2;
                prev2=result;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna