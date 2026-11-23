class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for (int r =0; r < n; r++) sortDiagonal(grid, r,0,true);
        for (int c =1; c < n; c++) sortDiagonal(grid, 0,c,false);

        return grid;
    }

    private void sortDiagonal(int[][] grid, int startRow,int startCol,boolean descenging){
        int n = grid.length;
        List <Integer> diagonal = new ArrayList<>();

        int r = startRow;
        int c = startCol;
        while (r<n && c < n) diagonal.add(grid[r++][c++]); 

        if (descenging) diagonal.sort(Collections.reverseOrder());
        else Collections.sort(diagonal);

        r = startRow;
        c = startCol;
        for (int val : diagonal) grid[r++][c++] = val;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna