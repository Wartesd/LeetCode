class Solution {
    public int[][] merge(int[][] intervals) {
        List <int[]> intervalList  = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int [] changableInterval = {intervals[0][0], intervals[0][1]};
        boolean isAddable = true; 
        for (int i=1; i<intervals.length; i++){
            if (changableInterval[1] >= intervals [i][0]){
                changableInterval[0] = Math.min(changableInterval[0], intervals[i][0]);
                changableInterval[1] = Math.max(changableInterval[1], intervals[i][1]);
                isAddable = false;
            }else{
                isAddable = true;
            }
            if (isAddable){
                intervalList.add(new int[]{changableInterval[0],changableInterval[1]});
                changableInterval[0] = intervals[i][0];
                changableInterval[1] = intervals[i][1];
            }
        }
        intervalList.add(new int[]{changableInterval[0],changableInterval[1]});
        return intervalList.toArray(new int [0][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna