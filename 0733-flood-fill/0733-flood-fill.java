class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        if (currentColor == color) return image;
        dfs (image, sr, sc, color, currentColor);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int color, int currentColor){
        if (sr < 0 || sc < 0 || sr>= image.length || sc >= image[0].length 
        || image[sr][sc] != currentColor) return;
        image[sr][sc] = color;
        dfs(image, sr+1, sc, color, currentColor);
        dfs(image, sr-1, sc, color, currentColor);
        dfs(image, sr, sc+1, color, currentColor);
        dfs(image, sr, sc-1, color, currentColor);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna