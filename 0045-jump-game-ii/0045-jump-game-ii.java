class Solution {
    public int jump(int[] nums) {
        int jumps=1;
        int currentEnd =0;
        int farthest=0;
        if (nums.length==1) return 0;
        for (int i=0; i<nums.length;i++){
            if(i>currentEnd){
                jumps++;
                currentEnd = farthest;
            }
            if (i+nums[i]>= nums.length-1) return jumps;
            farthest = Math.max(farthest, i+nums[i]);
        }
        return jumps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna