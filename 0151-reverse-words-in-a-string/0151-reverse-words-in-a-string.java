class Solution {
    public String reverseWords(String s) {
        int left=s.length()-1;
        int right=s.length()-1;
        StringBuilder reversedS = new StringBuilder();
        while (left >=0){
            left = skipMatching(s,left,true);
            if (left < 0) break;
            right=left;

            left = skipMatching(s,left,false);

            if (reversedS.length()>0) reversedS.append(" ");
            reversedS.append(s.substring(left+1, right+1));
        }
        return reversedS.toString();
    }

    private int skipMatching(String s, int index, boolean isSpace){
        while (index >=0 && Character.isWhitespace(s.charAt(index)) == isSpace){
            index--;
        }
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna