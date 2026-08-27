class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();

        backtrack(1,n,k,combinations, new ArrayList<>());
        return combinations;
    }
    private void backtrack(int start,int n, int k,List<List<Integer>> combinations, List<Integer> current){
        if (k==0){
            combinations.add(new ArrayList<>(current));
            return;
        }
        
        if (n - start + 1 < k) return;
            
        for (int i =start; i<=n; i++){
            current.add(i);
            backtrack(i+1, n,k-1, combinations, current);
            current.remove(current.size()-1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna