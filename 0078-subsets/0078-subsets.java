class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();


        backtrack(nums, 0, subsets , new ArrayList<>());
        return subsets;
    }

    private void backtrack(int[] nums, int start,List<List<Integer>> subsets,List<Integer> current){
        subsets.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++){
            current.add(nums[i]);
            backtrack(nums, i+1 , subsets , current);
            current.remove(current.size()-1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna