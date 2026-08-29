class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        Arrays.sort(nums);

        backtracking(nums, new boolean[nums.length],permutations,new ArrayList<>());
        return permutations;
    }

    private void backtracking(int[] nums, boolean[] visited, List<List<Integer>> permutations,List<Integer> current){
        if (current.size() == nums.length){
            permutations.add(new ArrayList<>(current));
            return;
        }

        for (int i=0; i<nums.length; i++){
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            current.add(nums[i]);
            visited[i] = true;
            backtracking(nums, visited,permutations, current);
            current.remove(current.size()-1);
            visited[i] = false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna