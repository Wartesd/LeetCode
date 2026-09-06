class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);


        backtracking(nums, 0 , subsets, new ArrayList<>());
        return subsets;
    }

    private void backtracking(int[] nums, int start,List<List<Integer>> subsets,List<Integer> current){
        subsets.add(new ArrayList<>(current));

        for (int i=start; i<nums.length; i++){
            if (i>start && nums[i] == nums[i-1]) continue;

            current.add(nums[i]);
            backtracking(nums, i+1 , subsets, current);
            current.remove(current.size()-1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna