class Solution {
    public int lengthOfLastWord(String s) {
        int end = -1;
        int start = -1;

        for(int i = s.length()-1; i>=0; i--){
            if (!Character.isLetter(s.charAt(i)) && end != -1) {
                start = i;
                break;
            }
           
            if (Character.isLetter(s.charAt(i)) && end == -1) end = i;
        }

        return end - start;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna