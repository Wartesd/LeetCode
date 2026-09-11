class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length){
            char currentChar = chars[read];
            int groupEnd = read;

            while (groupEnd < chars.length && chars[groupEnd] == currentChar) groupEnd++;
            
            chars[write++] = currentChar;
            int count = groupEnd - read;

            if (count > 1){
                for (char c : String.valueOf(count).toCharArray()) chars[write++] = c;
            }

            read = groupEnd;
        }
        
        return write;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna