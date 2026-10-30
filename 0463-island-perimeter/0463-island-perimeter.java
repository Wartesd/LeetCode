class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter =0;

        for (int row =0; row < grid.length; row++){
            for (int col=0; col < grid[0].length; col++){
                if (grid[row][col] == 0) continue;

                if (row==0 || grid[row-1][col]==0) perimeter++;
                if (row==grid.length-1 || grid[row+1][col]==0) perimeter++;
                if (col==0 || grid[row][col-1]==0) perimeter++;
                if (col==grid[0].length-1 || grid[row][col+1]==0) perimeter++;
            }
        }

        return perimeter;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna