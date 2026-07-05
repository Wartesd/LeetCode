class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> ((a[0]-a[1])- (b[0]-b[1])));
        int totalSum = 0;
        for (int i=0; i<costs.length; i++){
            if (i < (costs.length/2)) totalSum += costs[i][0];
            else totalSum += costs[i][1];
        }
        return totalSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna