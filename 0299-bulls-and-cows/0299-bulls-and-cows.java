class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] count = new int[10];

        for (int i=0; i<secret.length(); i++){
            if (secret.charAt(i) == guess.charAt(i)){
                bulls++;
                continue;
            }
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';

            if (count[s] < 0) cows++;
            if (count[g] > 0) cows++;

            count[s]++;
            count[g]--;
        }

        return bulls + "A" + cows + "B"; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna