class Solution {
    private final String[] MAPPING = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return combinations;
        
        backtrack(digits, 0 , combinations, new StringBuilder());
        return combinations;
    }

    private void backtrack(String digits,int index,List<String> combinations, StringBuilder current){
        if (index == digits.length()){
            combinations.add(current.toString());
            return;
        }

        String letters = MAPPING[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++){
            current.append(letters.charAt(i));
            backtrack(digits,index+1,combinations, current);
            current.deleteCharAt(current.length()-1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna