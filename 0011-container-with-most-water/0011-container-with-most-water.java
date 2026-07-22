class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int volume = 0;
        while (left<right){
            int currentVolume = (right - left) * Math.min(height[left], height[right]);
            volume = Math.max(volume, currentVolume);
            if (height[left] < height[right]) left++;
            else right--;       
        }
        return volume;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna