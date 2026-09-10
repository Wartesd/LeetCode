class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String xStr = String.valueOf(x);
        int left = 0;
        int right = xStr.length()-1;

        while (left<right){
            if (xStr.charAt(left++) != xStr.charAt(right--)) return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna