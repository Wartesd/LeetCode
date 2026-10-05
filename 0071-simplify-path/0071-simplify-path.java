class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] parts = path.split("/");

        for (String part: parts){
            if (part.isEmpty() || part.equals(".")) continue;

            if (part.equals("..")){
                if (!stack.isEmpty()) stack.pollLast();
            }else stack.addLast(part);
        }   

        return "/" + String.join("/", stack);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna