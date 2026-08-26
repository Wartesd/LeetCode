class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combinations = new ArrayList<>();
        
        if (arithmeticProgression(1, k) > n || arithmeticProgression(10 - k, k) < n) {
            return combinations;
        }
        backtrack(1,k,n, new ArrayList<>(), combinations);
        
        return combinations;
    }

    private void backtrack(int start, int k, int n, List<Integer> current, List<List<Integer>> combinations) {
        if (k==0 && n==0){
            combinations.add(new ArrayList<>(current));
            return;
        }

        if (n < 0 || k < 0 || n < arithmeticProgression(start,k)) return;

        for (int i=start; i<10; i++){
            current.add(i);
            backtrack(i+1, k-1, n-i, current, combinations);
            current.remove(current.size()-1);
        }
    }

    private int arithmeticProgression(int start, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += start + i;
        }
        return count;       
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna