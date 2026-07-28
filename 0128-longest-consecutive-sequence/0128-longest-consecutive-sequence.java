class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> numsSet = new HashSet<>(nums.length);
        int longest = 0;       
        for (int num:nums){
            numsSet.add(num);
        }
        for (int num : numsSet){
            int localLength =1;
            int currentNum =num+1;
            if (!numsSet.contains(num-1)){
                while (numsSet.contains(currentNum)){
                    localLength++;
                    currentNum++;
                }
                longest = Math.max(longest, localLength);
            }
        }
        return longest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna