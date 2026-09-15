class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = 0;
        int n2 = 0;
        int prev = 0;
        int curr = 0;
        int totalLength = nums1.length + nums2.length;
        boolean isOdd = (totalLength % 2) != 0;

        for (int count = 0; count <= totalLength / 2; count++) {
            prev = curr;

            if (n1 < nums1.length && (n2 >= nums2.length || nums1[n1] <= nums2[n2])) curr = nums1[n1++];
            else curr = nums2[n2++];
        }

        return isOdd ? curr : (prev + curr) / 2.0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna