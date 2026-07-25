class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLength = 0;
        Set <Character> uniqueSymbols = new HashSet<>();
        for (int right =0; right < s.length(); right++){
            if (uniqueSymbols.contains(s.charAt(right))){
                while (s.charAt(left) != s.charAt(right)){
                    uniqueSymbols.remove(s.charAt(left));
                    left++;
                }
                uniqueSymbols.remove(s.charAt(left));
                left++;
            }
            uniqueSymbols.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna