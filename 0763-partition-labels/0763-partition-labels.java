class Solution {
    public List<Integer> partitionLabels(String s) {
        Map <Character, Integer> letters = new HashMap<>();
        List <Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i=0; i<s.length(); i++ ){
            char c = s.charAt(i);
            letters.put(c, i);
        }
        for (int i=0; i<s.length(); i++){
            if (i-end == 1) start = i;
            end = Math.max(end, letters.get(s.charAt(i)));
            if (i==end){
                result.add(end-start+1);
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna