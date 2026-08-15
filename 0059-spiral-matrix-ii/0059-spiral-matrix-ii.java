class Solution {
    public int[][] generateMatrix(int n) {
        int[][] directions = {{0,1}, {1,0},{0,-1},{-1,0}};
        int current = 1;
        int[][] matrix = new int[n][n];
        int i=0;
        int j=0;
        int dirIndex = 0;
        
        while (current <= (n * n)){
            matrix[i][j]=current++;
            int nextI = i + directions[dirIndex][0];
            int nextJ = j + directions[dirIndex][1];
            if (nextI < 0 || nextJ < 0 || nextI >=n || nextJ >=n || matrix[nextI][nextJ] != 0){
                dirIndex = (dirIndex+1)%4;
                nextI = i + directions[dirIndex][0];
                nextJ = j + directions[dirIndex][1];
            }
            i=nextI;
            j=nextJ;
        }

        return matrix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna