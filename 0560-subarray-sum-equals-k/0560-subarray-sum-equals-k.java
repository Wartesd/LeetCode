class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> currentSumMap = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        currentSumMap.put(0,1);
        for (int num: nums){
            currentSum+=num;
            count += currentSumMap.getOrDefault(currentSum - k, 0);
            currentSumMap.put(currentSum, currentSumMap.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna