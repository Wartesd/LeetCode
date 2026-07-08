class Solution {
    public String largestNumber(int[] nums) {
        String [] numsString = new String[nums.length];
        StringBuilder sb = new StringBuilder(); 
        for (int i =0; i< nums.length; i++){
            numsString[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsString, (a,b) -> (b+a).compareTo(a+b));
        for (String s : numsString){
            sb.append(s);
        }
        if (sb.charAt(0)== '0') return "0";
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna