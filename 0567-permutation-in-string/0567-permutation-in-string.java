class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left =0;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        if (s1.length() > s2.length()) return false;
        for (char c : s1.toCharArray()){
            s1Count[c - 'a']++;
        }
        for (int right=0; right<s2.length(); right++){
            s2Count[s2.charAt(right) - 'a']++;
            if (right >= s1.length()-1){
                if (Arrays.equals(s1Count,s2Count)) return true;
                s2Count[s2.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna