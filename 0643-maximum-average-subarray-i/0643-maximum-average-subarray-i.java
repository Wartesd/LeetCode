class Solution {
    public double findMaxAverage(int[] nums, int k) {    
        int left = 0;
        double maxSum = 0; 
        double localSum = 0;
        for(int i=0; i< nums.length; i++){
            localSum+=nums[i];
            if (i >= (k-1)){
                if (i == (k-1)) maxSum = localSum;
                maxSum = Math.max(maxSum,localSum);
                localSum-=nums[left];
                left++;
            }  
        }
        return maxSum/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna