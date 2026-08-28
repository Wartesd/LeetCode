class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        
        backtracking(nums, new boolean[nums.length],new ArrayList<>(),permutations);
        return permutations;
    }

    private void backtracking(int[] nums,boolean[] visited, List<Integer> current,List<List<Integer>> permutations){
        if (current.size() ==  nums.length){
            permutations.add(new ArrayList<>(current));
            return;
        } 

        for (int i=0; i<nums.length; i++){
            if (visited[i] == true) continue;

            current.add(nums[i]);
            visited[i] = true;
            backtracking(nums, visited, current, permutations);
            visited[i] = false;
            current.remove(current.size()-1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna