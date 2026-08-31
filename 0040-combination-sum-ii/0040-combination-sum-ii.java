class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();


        Arrays.sort(candidates);
        backtracking(candidates, target, 0 , combinations, new ArrayList<>());
        return combinations;
    }

    private void backtracking(int[] candidates, int target,int start,List<List<Integer>> combinations, List<Integer> current){
        if (target < 0) return;
        if (target==0){
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i=start; i < candidates.length; i++){
            if (i>start && candidates[i] == candidates[i-1] ) continue;

            current.add(candidates[i]);
            backtracking(candidates, target - candidates[i] ,i+1, combinations, current);
            current.remove(current.size() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna