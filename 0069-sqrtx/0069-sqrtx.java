class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid =0;
        if (x < 2) return x;
        while (left <= right){
            mid = left + (right-left)/2;
            long check =(long) mid*mid;
            if ((long) x == check) return mid;
            else if ((long) x > check) left = mid+1;
            else if ((long) x < check) right = mid-1;
        }
        return right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna