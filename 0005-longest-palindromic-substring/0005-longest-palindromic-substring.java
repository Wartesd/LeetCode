class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i<s.length(); i++){
            if (expand(s,i,i).length() > result.length()){
                result = expand(s,i,i);
            }
            if (expand(s,i,i+1).length() > result.length()){
                result = expand(s,i,i+1);
            }
        }
        return result;
    }
    private String expand (String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna