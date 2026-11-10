class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[nums.length+1];
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums){
            int i = count[num];
            
            if (i == result.size()) result.add(new ArrayList<>());

            result.get(i).add(num);
            count[num]++;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna