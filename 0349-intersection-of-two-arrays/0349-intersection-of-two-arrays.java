class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];

        for (int n : nums1) seen [n] = true;

        int temp[] = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;

        for (int n : nums2){
            if (seen[n]){
                temp[count++]=n;
                seen[n] = false;
            }
        }

        return Arrays.copyOf(temp, count);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna