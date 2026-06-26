class Solution {
    public int jump(int[] nums) {
        int steps=1;
        int index =0;
        int secondIndex=0;
        if (nums.length==1) return 0;
        for (int i=0; i<nums.length;i++){
            if(i>index){
                steps++;
                index = secondIndex;
            }
            if (i+nums[i]>= nums.length-1) return steps;
            secondIndex = Math.max(secondIndex, i+nums[i]);
        }
        return steps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna