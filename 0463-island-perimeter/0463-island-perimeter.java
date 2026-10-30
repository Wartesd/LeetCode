class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighbours = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    islands++;
                    if (row > 0 && grid[row - 1][col] == 1) neighbours++;
                    if (col > 0 && grid[row][col - 1] == 1) neighbours++;
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna