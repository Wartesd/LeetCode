class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (pairs.containsKey(s.charAt(i))){
                if (stack.isEmpty() || pairs.get(s.charAt(i)) != stack.pop()){
                    return false;
                }
            } else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}