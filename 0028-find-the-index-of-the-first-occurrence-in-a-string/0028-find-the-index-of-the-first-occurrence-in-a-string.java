class Solution {
    public int strStr(String haystack, String needle) {
        int hL = haystack.length();
        int nL = needle.length();

        for (int i = 0; i <= hL - nL; i++){
            if (haystack.substring(i, i+nL).equals(needle)) return i;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna