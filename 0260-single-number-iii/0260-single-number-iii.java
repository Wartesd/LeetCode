class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) xor^=num;
        
        int diff = xor & (-xor);
        int a=0;
        int b=0;

        for (int num : nums){
            if ((num & diff) == 0) a^=num;
            else b^=num;
        }

        return new int[]{a,b};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna