class Solution {
    public int integerReplacement(int n) {
        long val = n;
        int count = 0;

        while (val != 1){
            if ((val & 1) == 0) val>>=1;
            else if (val == 3 || (val & 2) == 0) val--;
            else val++;

            count++;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna