class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(linearRob(nums,0,nums.length-2),linearRob(nums,1,nums.length-1));
    }
    private int linearRob(int [] nums, int start, int end){
        int prev1 = 0;
        int prev2=0;
        int result =0;
        for (int i =start; i<=end; i++){
            if (i==start){
                result = nums[i];
                prev1 = result;
            }
            else if (i==start+1){
                result = Math.max(prev1, nums[i]);
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