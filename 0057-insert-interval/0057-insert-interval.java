class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List <int[]> intervalsList = new ArrayList<>();
        boolean flag = false;
        for (int i=0; i<intervals.length; i++){
            if (newInterval[0] <= intervals[i][1] && newInterval[1] >= intervals[i][0]){
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            else if (newInterval[1] < intervals[i][0]){
                if (!flag){
                    intervalsList.add(newInterval);
                    flag = true;
                }
                intervalsList.add(intervals[i]);
            }
            else if (newInterval[0] > intervals[i][1]){
                intervalsList.add(intervals[i]);
            }
        }
        if (!flag) intervalsList.add(newInterval);
        return intervalsList.toArray(new int[0][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna