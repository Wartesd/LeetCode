class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0;
        int index = 0;
        int total = 0;
        for (int i=0;i<gas.length; i++){
            int diff=gas[i]-cost[i];
            tank +=diff;
            total += diff;
            if (tank<0){
                tank = 0;
                index = i+1;
                continue;
            }
        }
        if (total < 0) return -1;
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna