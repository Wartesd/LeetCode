class Solution {
    public int reverse(int x) {
        String xStr = String.valueOf(x); 
        StringBuilder reversedX = (xStr.charAt(0) == '-') ? new StringBuilder("-") : new StringBuilder();
        int end = reversedX.length();

        for (int i = xStr.length()-1; i >= end; i--) reversedX.append(xStr.charAt(i));    
        
        try{
            return Integer.parseInt(reversedX.toString());
        } catch (NumberFormatException e){
           return 0; 
        }   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna