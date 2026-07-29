class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map <Integer, Integer> remainingMap = new HashMap<>();
        int runningSum = 0;
        remainingMap.put(0,-1);
        for (int i=0; i<nums.length; i++){
            runningSum+=nums[i];
            int reminder = runningSum % k;
            if (remainingMap.containsKey(reminder)){
                if (i-remainingMap.get(reminder) > 1) return true;
            }else{
                remainingMap.put(reminder,i);
            }
        }
        return false;
    }
} 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna