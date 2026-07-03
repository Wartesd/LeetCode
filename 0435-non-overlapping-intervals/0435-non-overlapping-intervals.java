class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        int lastIndex =0;
        Arrays.sort(intervals, (a,b)-> a[1] - b[1]);
        for (int i =1; i< intervals.length; i++){
            if (intervals [i][0] < intervals[lastIndex][1]){
                count++;
            } else{
                lastIndex = i;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna