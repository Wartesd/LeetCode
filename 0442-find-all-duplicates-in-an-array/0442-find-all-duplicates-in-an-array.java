class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i=0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            int index = val -1;

            if (nums[index] < 0) duplicates.add(val);
            else nums[index] = -nums[index];
        }

        return duplicates;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna