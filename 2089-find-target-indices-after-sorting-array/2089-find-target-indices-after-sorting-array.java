class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int equal=0;
        List<Integer> targets = new ArrayList<>();

        for (int num:nums) {
            if (num < target) less++;
            else if(num == target) equal++; 
        }

        for (int i=0; i<equal; i++){
            targets.add(less+i);
        }

        return targets;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna