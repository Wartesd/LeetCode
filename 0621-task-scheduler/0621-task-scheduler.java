class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int [26];
        int countMaxFreq=1;
        for (char c : tasks){
            frequencies[c-'A']++;
        }
        Arrays.sort(frequencies);
        for (int i=24; i>=0; i--){
            if (frequencies[i] == frequencies[25]) countMaxFreq++;
            else break;
        }
        return Math.max(tasks.length,((frequencies[25]-1)*(n+1)+countMaxFreq));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna