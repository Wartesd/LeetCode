class Solution {
    public String intToRoman(int num) {
        StringBuilder romanNum = new StringBuilder(); 
        String numString = Integer.toString(num);
        int discharge = 4 - numString.length();

        for (int i=0; i < numString.length() ; i++){
            int digit = numString.charAt(i)-'0';
            switch (discharge){
                case 0 -> romanNum.append("M".repeat(digit));
                case 1 -> appendRomanDigit(digit, 'C', 'D', 'M', romanNum);
                case 2 -> appendRomanDigit(digit, 'X', 'L', 'C', romanNum);
                case 3 -> appendRomanDigit(digit, 'I', 'V', 'X', romanNum);
            }
            discharge++;
        }
        return romanNum.toString();
    }

    private void appendRomanDigit(int digit, char one, char five, char ten, StringBuilder sb) {
        if (digit == 0) return;
    
        String sOne = String.valueOf(one);
        String sFive = String.valueOf(five);
        String sTen = String.valueOf(ten);

        if (digit >= 1 && digit <= 3) sb.append(sOne.repeat(digit));
        if (digit == 4) sb.append(sOne + sFive);
        if (digit == 5) sb.append(sFive);
        if (digit >= 6 && digit <= 8) sb.append(sFive + sOne.repeat(digit - 5));
        if (digit == 9) sb.append(sOne + sTen);
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna